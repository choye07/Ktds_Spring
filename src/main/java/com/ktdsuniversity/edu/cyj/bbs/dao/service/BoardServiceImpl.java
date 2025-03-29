package com.ktdsuniversity.edu.cyj.bbs.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.cyj.bbs.dao.BoardDao;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardListVO;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public BoardListVO selectAllBoard() {
		// 게시글 건수와 게시글 목록을 가지는 VO 객체 선언
		BoardListVO boardListVO = new BoardListVO();
		// 게시글 총 건수 조회
		boardListVO.setBoardCnt(boardDao.selectBoardAllCount());
		// 게시글 목록 조회
		boardListVO.setBoardList(boardDao.selectAllBoard());
		return boardListVO;
	}

	@Override
	public boolean insertNewBoard(BoardVO boardVO) {
		// DB에 게시글 등록
		// createCount에는 DB에 등록한 게시글의 개수를 반환.
		int createCount = boardDao.insertNewBoard(boardVO);
		// DB에 등록한 개수가 0보다 크다면 성공. 아니라면 실패.
		return createCount > 0;

	}

	@Override
	public BoardVO selectOneBoard(int id, boolean isIncrease) {
		// 파라미터로 전달받은 게시글의 조회 수 증가
		// updateCount에는 DB에 업데이트한 게시글의 수를 반환.
		int updateCount = boardDao.addViewCount(id);
		if (updateCount == 0) {
			// updateCount가 0이라는 것은 
			// 파라미터로 전달받은 id 값이 DB에 존재하지 않는다는 의미이다.
			// 이 경우, 잘못된 접근입니다. 라고 사용자에게 예외 메시지를 보내준다.
			throw new IllegalArgumentException("잘못된 접근입니다.");
			}
		// 예외가 발생하지 않았다면, 게시글 정보를 조회한다.     
		BoardVO boardVO = boardDao.selectOneBoard(id);
		if(boardVO==null) {
			throw new IllegalArgumentException("잘못된 접근입니다.");
		}
		return boardVO;

	}

	@Override
	public boolean updateOneBoard(BoardVO boardVO) {
		int updateCount = boardDao.updateOneBoard(boardVO);
		return updateCount > 0;
	}

	@Override
	public boolean deleteOneBoard(int id) {
		// 파라미터로 전달받은 id로 게시글을 삭제.
		// deleteCount에는 DB에서 삭제한 게시글의 수를 반환.
		int deleteCount = boardDao.deleteOneBoard(id);
		return deleteCount > 0;
	}

}
