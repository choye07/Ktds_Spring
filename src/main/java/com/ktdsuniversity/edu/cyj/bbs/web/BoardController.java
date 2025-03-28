package com.ktdsuniversity.edu.cyj.bbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniversity.edu.cyj.bbs.dao.service.BoardService;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardListVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("hello-cyj/board/list")
	public ModelAndView viewBoardList() {
		BoardListVO boardListVO =boardService.selectAllBoard();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board/boardlist");
		modelAndView.addObject("boardList", boardListVO);

		return modelAndView;
	}
}
