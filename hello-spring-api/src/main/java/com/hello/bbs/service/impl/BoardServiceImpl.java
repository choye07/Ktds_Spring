package com.hello.bbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.service.BoardService;
import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardListVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;
import com.hello.beans.FileHandler;
import com.hello.beans.FileHandler.StoredFile;
import com.hello.exceptions.ApiException;
import com.hello.file.dao.FileDao;
import com.hello.file.vo.FileVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;
    
    @Autowired
    private FileDao fileDao;
    
    @Autowired
    private FileHandler fileHandler;

    @Transactional(readOnly = true)
	@Override
	public BoardListVO getBoardList(BoardSearchRequestVO boardSearchRequestVO) {
		int count = this.boardDao.selectBoardAllCount(boardSearchRequestVO);
		boardSearchRequestVO.setPageCount(count);
		
		List<BoardVO> boardList = this.boardDao.selectBoardAll(boardSearchRequestVO);
		
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(count);
		boardListVO.setBoardList(boardList);
		
		return boardListVO;
	}

    @Transactional
	@Override
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO) {
		int insertedCount = this.boardDao.insertNewBoard(boardWriteRequestVO);
		
		// if insertedCount > 0 then file upload
		if (insertedCount > 0 && boardWriteRequestVO.getFile()!=null) {
			for (MultipartFile file : boardWriteRequestVO.getFile()) {
				StoredFile storedFile = this.fileHandler.store(file);
				if (storedFile != null) {
					// 파일 업로드가 정상적으로 이루어 졌다.
					// FILE 테이블에 파일 데이터를 추가한다.
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
	
    @PostAuthorize("hasRole('ROLE_ADMIN') or @rah.isBoardOwner(#isIncrease, returnObject)")
    @Transactional
	@Override
	public BoardVO getOneBoard(int id, boolean isIncrease) {
		if (isIncrease) {
			// 1. 조회하려는 게시글의 조회수를 증가시킨다.
			int updatedCount = this.boardDao.updateViewCountBy(id);
			
			// 2. 업데이트의 수가 0보다 크다면 게시글이 존재한다는 의미이므로
			//    게시글을 조회해 온다.
			if (updatedCount == 0) {
				throw new ApiException(id + " 게시글은 존재하지 않습니다.");
			}
		}
		
		BoardVO boardVO = this.boardDao.selectOneBoard(id);
		if (boardVO == null) {
			throw new ApiException(id + " 게시글은 존재하지 않습니다.");
		}
		// 게시글을 반환.
		return boardVO;
	}
	
    @PreAuthorize("hasRole('ROLE_ADMIN') or @rah.isBoardOwner(#boardDeleteRequestVO.id)")
    @Transactional
	@Override
	public boolean deleteOneBoard(BoardDeleteRequestVO boardDeleteRequestVO) {
		int deletedCount = this.boardDao.deleteOneBoard(boardDeleteRequestVO);
		
		return deletedCount > 0;
	}
	
    @PreAuthorize("hasRole('ROLE_ADMIN') or @rah.isBoardOwner(#boardUpdateRequestVO.id)")
    @Transactional
	@Override
	public boolean updateOneBoard(BoardUpdateRequestVO boardUpdateRequestVO) {
		return this.boardDao.updateOneBoard(boardUpdateRequestVO) > 0;
	}

}













