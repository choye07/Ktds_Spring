package com.hello.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.hello.beans.CustomBeanProvider;
import com.hello.beans.FileHandler;
import com.hello.beans.FileHandler.StoredFile;
import com.hello.board.dao.BoardDao;
import com.hello.board.service.BoardService;
import com.hello.board.vo.BoardDeleteRequestVO;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardSearchRequestVO;
import com.hello.board.vo.BoardUpdateRequestVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;
import com.hello.exceptions.PageNotFoundException;
import com.hello.file.dao.FileDao;
import com.hello.file.vo.FileVO;

@Service
public class BoardServiceImpl implements BoardService {

	private final CustomBeanProvider customBeanProvider;

	@Autowired
	private BoardDao boardDao;

	@Autowired
	private FileHandler fileHandelr;

	@Autowired
	private FileDao fileDao;

	BoardServiceImpl(CustomBeanProvider customBeanProvider) {
		this.customBeanProvider = customBeanProvider;
	}

	@Transactional(readOnly=true) // 정말 select만 해야하는 기능이라면 붙여줘야한다.
	@Override
	public BoardListVO getBoardList(BoardSearchRequestVO boardSearchRequestVO) {
		int count = this.boardDao.selectBoardAllCount(boardSearchRequestVO);
		boardSearchRequestVO.setPageCount(count);
		
		List<BoardVO> boardList = this.boardDao.selectAllBoard(boardSearchRequestVO);
		
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(count);
		boardListVO.setBoardList(boardList);
		
		return boardListVO;
	}

	@Transactional
	@Override
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO) {

		// 아이디가 이미 할당 되어있다.mapper파일에서 selectkey를 사용햇기 때문이다.
		int insertedCount = boardDao.insertNewBoard(boardWriteRequestVO);
		// DB에 등록한 개수가 0보다 크다면 성공. 아니라면 실패.
		// if insertedCount>0 파일 업로드
		if (insertedCount > 0) {
			for (MultipartFile file : boardWriteRequestVO.getFile()) {

				StoredFile storedFile = this.fileHandelr.store(file);
				// 방어 코드
				if (storedFile != null) {
					FileVO fileVO = new FileVO();
					fileVO.setId(boardWriteRequestVO.getId());
					fileVO.setFlNm(storedFile.getFileName());
					fileVO.setObfsFlNm(storedFile.getRealFileName());
					fileVO.setObfsFlPth(storedFile.getRealFilePath());
					fileVO.setFlSz(storedFile.getFileSize());

					this.fileDao.insertNewFile(fileVO);
				}
			}
		}

		return insertedCount > 0;
	}

	@Transactional
	@Override
	public BoardVO getOneBaord(int id, boolean isIncrease) {
		// 게시글 조회.
		// 조회수가 증가 되기 전의 데이터를 조회
//		BoardVO boardVO = this.boardDao.selectOneBoard(id);
//		// 게시글이 존재하면 조회수를 증가시킨다.
//		if(boardVO!=null) {
//			//조회한 이후에 조회수를 증가한 것.
//			this.boardDao.updateViewCountBy(id);
//		}

		// == update페이지로 넘어갈 때에는 증가시키면 안됨.
		if (isIncrease) {

			int updatedCount = this.boardDao.updateViewCountBy(id);
			// 2. 업데이트의 수가 0보다 크다면 게시글이 존재한다는 의미이므로
			if (updatedCount > 0) {
				BoardVO boardVO = this.boardDao.selectOneBoard(id);
				return boardVO;
			}
			throw new PageNotFoundException(id);
		} else {
			BoardVO boardVO = this.boardDao.selectOneBoard(id);
			// boardVO 게시글을 잘 가져왔는지 체크.
			if (boardVO == null) {
				throw new PageNotFoundException(id);
			}
			return boardVO;
		}
		// 1.조회 하려는게시글의 조회수를 증가시킨다.
		// 게시글을 조회해 온다.
//		return null;
	}
	@Transactional
	@Override
	public boolean deleteOneBoard(BoardDeleteRequestVO boardDeleteRequestVO) {
		int deleteCount = this.boardDao.deleteOneBoard(boardDeleteRequestVO);
		if (deleteCount == 0) {
			throw new PageNotFoundException(boardDeleteRequestVO.getId());
		}
		return deleteCount > 0;
	}
	
	@Transactional
	@Override
	public boolean updataeOneBoard(BoardUpdateRequestVO boardUpdateRequestVO) {

		int updatedCount = this.boardDao.updateOneBoard(boardUpdateRequestVO);
		if (updatedCount == 0) {
			throw new PageNotFoundException(boardUpdateRequestVO.getId());
		}
		return updatedCount > 0;
	}

}