package com.hello.board.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.board.service.BoardService;
import com.hello.board.vo.BoardDeleteRequestVO;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardSearchRequestVO;
import com.hello.board.vo.BoardUpdateRequestVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;
import com.hello.common.util.AuthUtil;

import jakarta.validation.Valid;


@PreAuthorize("isAuthenticated()")
@Controller
public class BoardController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	private BoardService boardService;

	
	//http://localhost:8080/board/list?pageNo=0&listSize=20
	/* @Secured("ROLE_ADMIN") */
	@PreAuthorize("hasAuthority('BOARD_READ_LIST')") // @@Secured와 동일한 역할 수행 + SecurityEL을 사용할 수 있다.
	@GetMapping("/board/list")
	public String viewBoardList(Model model, BoardSearchRequestVO boardSearchRequestVO) {
		
		/*
		 * LOGGER.trace("/board/list 를 방문했습니다."); LOGGER.debug("/board/list 를 방문했습니다.");
		 * LOGGER.info("/board/list 를 방문했습니다."); LOGGER.warn("/board/list 를 방문했습니다.");
		 * LOGGER.error("/board/list 를 방문했습니다.");
		 * LOGGER.debug("왜 없니"+boardSearchRequestVO.getWriterName());
		 * LOGGER.debug("왜 없니"+boardSearchRequestVO.getWriterEmail());
		 * LOGGER.debug("왜 없니"+String.valueOf(boardSearchRequestVO.getPageNo()));
		 * LOGGER.debug("왜 없니"+String.valueOf(boardSearchRequestVO.getListSize()));
		 */
		
		BoardListVO boardListVO = this.boardService.getBoardList(boardSearchRequestVO);
		model.addAttribute("boardList", boardListVO);
		model.addAttribute("pagination", boardSearchRequestVO);
		

		return "board/boardlist";
	}

	@PreAuthorize("hasAuthority('BOARD_CREATE')")
	@GetMapping("/board/write")
	public String viewBoardWritePage() {

		return "board/boardwrite";
	}

	@PreAuthorize("hasAuthority('BOARD_CREATE')")
	@PostMapping("/board/write")
	public String doBoardWrite(
			@Valid //  boardWriteRequestVO의 파라미터 검사를 요청한다.
			@ModelAttribute // Spring Form Taglib를 사용할 때만 작성. 
			BoardWriteRequestVO boardWriteRequestVO,
			BindingResult bindingResult,
			Model model) {
		
		// 에러가 있을 때(유효성 검사의 에러) 게시글을 등록하면 안된다.
		// 사용자에게 잘못 입력했음을 알려주어야 한다.
		// 사용자가 입력했던 모든 내용들을 글쓰기 페이지로 다 보내주어야 한다.
		// 에러의 내용도 보내주어야 한다. --> 자동 전송
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("userWriteBoardVO",boardWriteRequestVO);
			return "/board/boardwrite";
		}
		boardWriteRequestVO.setEmail(AuthUtil.getEmail());

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
	@PreAuthorize("hasAuthority('BOARD_READ')")
	@GetMapping("/board/view") // request값이 많아지면 boardVO로 받아온다.
	public String viewBoardDetailPageUseQueryStringParameter(@RequestParam int id, Model model) {
		BoardVO boardVO = this.boardService.getOneBaord(id, true);
		model.addAttribute("BoardVO", boardVO);
		return "board/boardview";
	}

	// 2. path variable parameter
	// /board/view/3
	@PreAuthorize("hasAuthority('BOARD_READ')")
	@GetMapping("/board/view/{id}")
	public String viewBoardDetailPageUserPathVariable(@PathVariable int id, Model model) {
		BoardVO boardVO = this.boardService.getOneBaord(id, true);
		model.addAttribute("BoardVO", boardVO);
		return "board/boardview";

	}
	@PreAuthorize("hasAuthority('BOARD_UPDATE')")
	@GetMapping("/board/modify/{id}")
	public String doUpdateOneBoard(@PathVariable int id, Model model) {
		
		BoardVO boardVO = this.boardService.getOneBaord(id, false);
		/*
		 * if(!boardVO.getEmail().equals(AuthUtil.getEmail())) {
		 * 
		 * return "redirect:/board/list"; }
		 */
		model.addAttribute("BoardVO", boardVO);
		return "board/boardmodify";
	}
	@PreAuthorize("hasAuthority('BOARD_UPDATE')")
	@PostMapping("/board/modify/{id}")
	public String doUpdate(@PathVariable int id, 
			BoardUpdateRequestVO boardUpdateRequestVO) {
		
		boardUpdateRequestVO.setEmail(AuthUtil.getEmail());
		
		boolean isSucess = this.boardService.updataeOneBoard(boardUpdateRequestVO);
		
		if (isSucess) {
			return "redirect:/board/view/" + id;
		}
		return  "redirect:/board/list";
	}
	@PreAuthorize("hasAuthority('BOARD_DELETE')")
	@GetMapping("/board/delete/{id}")
	public String doDeleteOneBoard(@PathVariable int id ) {
		
		BoardDeleteRequestVO boardDeleteRequestVO = new BoardDeleteRequestVO();
		boardDeleteRequestVO.setId(id);
		boardDeleteRequestVO.setEmail(AuthUtil.getEmail());
		
		boolean isSucess = this.boardService.deleteOneBoard(boardDeleteRequestVO);

		if (isSucess) {
			return "redirect:/board/list";
		}
		return "redirect:/board/view/" + id;
	}
}