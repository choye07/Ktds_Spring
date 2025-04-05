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
import com.hello.board.vo.BoardUpdateRequestVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;
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
	public BoardListVO getBoardList() {

		int count = this.boardDao.selectBoardAllCount();
		List<BoardVO> boardlist = this.boardDao.selectAllBoard();
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(count);
		boardListVO.setBoardList(boardlist);
		return boardListVO;
	}

	@Transactional
	@Override
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO) {

		// 아이디가 이미 할당 되어있다.mapper파일에서 selectkey를 사용햇기 때문이다.
		int insertedCount = boardDao.insertNewBoard(boardWriteRequestVO);
		// DB에 등록한 개수가 0보다 크다면 성공. 아니라면 실패.
		// if insertedCount>0 파일 업로드
		System.out.println(boardWriteRequestVO.getFile());
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
//				System.out.println("새로운 게시글의 아이디는 "+boardWriteRequestVO.getId()+"입니다.");
//				System.out.println(storedFile.getFileName());
//				System.out.println(storedFile.getRealFileName());
//				System.out.println(storedFile.getRealFilePath());
//				System.out.println(storedFile.getFileSize());
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
				System.out.println(boardVO.getContent());
				return boardVO;
			}
			throw new IllegalArgumentException(id + "는 존재하지 않는 게시글 번호입니다.");
		} else {
			BoardVO boardVO = this.boardDao.selectOneBoard(id);
			// boardVO 게시글을 잘 가져왔는지 체크.
			if (boardVO == null) {
				throw new IllegalArgumentException(id + "는 존재하지 않는 게시글 번호입니다.");
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
			throw new IllegalArgumentException(boardDeleteRequestVO.getId() + "는 존재하지 않는 게시글 번호입니다.");
		}
		return deleteCount > 0;
	}
	
	@Transactional
	@Override
	public boolean updataeOneBoard(BoardUpdateRequestVO boardUpdateRequestVO) {

		int updatedCount = this.boardDao.updateOneBoard(boardUpdateRequestVO);
		if (updatedCount == 0) {
			throw new IllegalArgumentException(boardUpdateRequestVO.getId() + "는 존재하지 않는 게시글 번호입니다.");
		}
		return updatedCount > 0;
	}

}