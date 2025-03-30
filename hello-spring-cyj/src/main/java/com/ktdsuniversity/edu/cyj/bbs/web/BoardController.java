package com.ktdsuniversity.edu.cyj.bbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniversity.edu.cyj.bbs.dao.service.BoardService;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardListVO;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("hello-cyj/board/list")
	public ModelAndView viewBoardList() {
		BoardListVO boardListVO = boardService.selectAllBoard();

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board/boardlist");
		modelAndView.addObject("boardList", boardListVO);

		return modelAndView;
	}

	@GetMapping("/hello-cyj/board/write")
	public String viewBoardWritePage() {
		return "board/boardwrite";
	}

	@PostMapping("/hello-cyj/board/write")
	public ModelAndView doBoardWrite(BoardVO boardVO) {
		System.out.println("제목: " + boardVO.getSubject());
		System.out.println("이메일: " + boardVO.getEmail());
		System.out.println("내용: " + boardVO.getContent());
		System.out.println("등록일: " + boardVO.getCrtDt());
		System.out.println("수정일: " + boardVO.getMdfyDt());
		System.out.println("FileName: " + boardVO.getFileName());
		System.out.println("OriginFileName: " + boardVO.getOriginFileName());
		ModelAndView modelAndView = new ModelAndView();
		// 게시글 등록
		boolean isSuccess = boardService.insertNewBoard(boardVO);
		if (isSuccess) {
			// 게시글 등록 결과가 성공이라면
			// /board/list URL로 이동한다.
			modelAndView.setViewName("redirect:/hello-cyj/board/list");
			return modelAndView;
		} else {
			// 게시글 등록 결과가 실패라면
			// 게시글 등록(작성) 화면으로 데이터를 보내준다.
			// 게시글 등록(작성) 화면에서 boardVO 값으로 등록 값을 설정해야 한다.
			modelAndView.setViewName("board/boardwrite");
			modelAndView.addObject("boardVO", boardVO);
			return modelAndView;
		}
	}

	@GetMapping("/hello-cyj/board/view")
	public ModelAndView viewOneBoard(@RequestParam int id) {
		BoardVO boardVO = boardService.selectOneBoard(id, true);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board/boardview");
		modelAndView.addObject("boardVO", boardVO);
		return modelAndView;
	}

	@GetMapping("/hello-cyj/board/modify/{id}") // http://localhost:8080/board/modify/2
	public ModelAndView viewBoardModifyPage(@PathVariable int id) {
		// 게시글 수정을 위해 게시글의 내용을 조회한다.
		// 게시글 조회와 동일한 코드 호출
		BoardVO boardVO = boardService.selectOneBoard(id, false);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board/boardmodify");
		modelAndView.addObject("boardVO", boardVO);
		return modelAndView;
	}

	@PostMapping("/board/modify") // http://localhost:8080/board/modify/2
	public ModelAndView doBoardUpdate(BoardVO boardVO) {
		System.out.println("ID: " + boardVO.getId());
		System.out.println("제목: " + boardVO.getSubject());
		System.out.println("이메일: " + boardVO.getEmail());
		System.out.println("내용: " + boardVO.getContent());
		System.out.println("등록일: " + boardVO.getCrtDt());
		System.out.println("수정일: " + boardVO.getMdfyDt());
		System.out.println("FileName: " + boardVO.getFileName());
		System.out.println("OriginFileName: " + boardVO.getOriginFileName());
		ModelAndView modelAndView = new ModelAndView();
		// 게시글 수정
		boolean isSuccess = boardService.updateOneBoard(boardVO);
		if (isSuccess) {
			// 게시글 수정 결과가 성공이라면
			// /board/view?id=id URL로 이동한다.
			modelAndView.setViewName("redirect:/hello-cyj/board/view?id=" + boardVO.getId());
			return modelAndView;
		} else {
			// 게시글 수정 결과가 실패라면
			// 게시글 수정 화면으로 데이터를 보내준다.
			modelAndView.setViewName("board/boardmodify");
			modelAndView.addObject("boardVO", boardVO);
			return modelAndView;
		}
	}

	@GetMapping("/hello-cyj/board/delete/{id}")
	public String doDeleteBoard(@PathVariable int id) {
		boolean isSuccess = boardService.deleteOneBoard(id);
		if (isSuccess) {
			return "redirect:/hello-cyj/board/list";
		} else {
			return "redirect:/hello-cyj/board/view?id=" + id;
		}
	}
}
