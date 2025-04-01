package com.hello.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.board.service.BoardService;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardUpdateRequestVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board/list")
	public String viewBoardList(Model model) {

		BoardListVO boardListVO = boardService.getBoardList();
		model.addAttribute("boardList", boardListVO);
		return "board/boardlist";
	}

	@GetMapping("/board/boardwrite")
	public String viewBoardWritePage() {

		return "board/boardwrite";
	}

	@PostMapping("/board/write")
	public String doBoardWrite(BoardWriteRequestVO boardWriteRequestVO) {

		boolean isCreated = this.boardService.createNewBoard(boardWriteRequestVO);
		if (isCreated) {
			/**
			 * http status code: 302Found location: http://localhost:8080/board/list
			 */
			return "redirect:/board/list";
		}

		// 절대 실행 되지 않는 케이스.
		return "board/boardwrite";

	}
	// 아래 두가지 코드는 같은 동작

	// 1. Query String Parameter
	// /board/view?id=3
	@GetMapping("/board/view") // request값이 많아지면 boardVO로 받아온다.
	public String viewBoardDetailPageUseQueryStringParameter(@RequestParam int id, Model model) {
		BoardVO boardVO = this.boardService.getOneBaord(id, true);
		model.addAttribute("BoardVO", boardVO);
		return "board/boardview";
	}

	// 2. path variable parameter
	// /board/view/3
	@GetMapping("/board/view/{id}")
	public String viewBoardDetailPageUserPathVariable(@PathVariable int id, Model model) {
		BoardVO boardVO = this.boardService.getOneBaord(id, true);
		model.addAttribute("BoardVO", boardVO);
		return "board/boardview";

	}

	@GetMapping("/board/modify/{id}")
	public String doUpdateOneBoard(@PathVariable int id, Model model) {
		BoardVO boardVO = this.boardService.getOneBaord(id, false);
		model.addAttribute("BoardVO", boardVO);
		return "board/boardmodify";
	}
	@PostMapping("/baord/modify")
	public String doUpdate(BoardUpdateRequestVO boardUpdateRequestVO) {
		return null;
	}

	@GetMapping("/board/delete/{id}")
	public String doDeleteOneBoard(@PathVariable int id) {
		boolean isSucess = this.boardService.deleteOneBoard(id);

		if (isSucess) {
			return "redirect:/board/list";
		}
		return "redirect:/board/view/" + id;
	}
}