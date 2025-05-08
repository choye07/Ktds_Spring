package com.hello.bbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.bbs.service.BoardService;
import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardListVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;
import com.hello.common.util.AuthUtil;
import com.hello.common.vo.ApiResponse;

import jakarta.validation.Valid;

@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping("/api/v1")
public class BoardApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BoardApiController.class);

	@Autowired
	private BoardService boardService;

	// http://localhost:8080/board/list?pageNo=0&listSize=20
	// @Secured("ROLE_ADMIN")
	@PreAuthorize("hasAuthority('BOARD_READ_LIST')") // @Secured와 동일한 역할 수행 + SecurityEL 을 사용할 수 있다!
	@GetMapping("/board")
	public ApiResponse viewBoardList(BoardSearchRequestVO boardSearchRequestVO) {

		BoardListVO boardListVO = this.boardService.getBoardList(boardSearchRequestVO);
		ApiResponse apiResponse = new ApiResponse(200, boardListVO.getBoardList());
		apiResponse.setCount(boardListVO.getBoardCnt());
		apiResponse.setPage(boardSearchRequestVO.getPageNo());
		apiResponse.setPageCount(boardSearchRequestVO.getPageCount());
		apiResponse.setHasMore(boardSearchRequestVO.getPageNo() + 1 < boardSearchRequestVO.getPageCount());
		apiResponse.setListSize(boardSearchRequestVO.getListSize());

		return apiResponse;
	}

	@PreAuthorize("hasAuthority('BOARD_CREATE')")
	@PostMapping("/board")
	public ApiResponse doBoardWrite(@Valid // BoardWriteRequestVO의 파라미터 검사를 요청한다. // Spring Form Taglib를 사용할 때만 작성.
	BoardWriteRequestVO boardWriteRequestVO, BindingResult bindingResult // @Valid 검사의 결과를 받아온다.

	) {

		if (bindingResult.hasErrors()) {
			return new ApiResponse(bindingResult.getFieldErrors());
		}

		boardWriteRequestVO.setEmail(AuthUtil.getEmail());

		boolean isCreated = this.boardService.createNewBoard(boardWriteRequestVO);
		return new ApiResponse(isCreated);
	}

	// Path Variable Parameter
	// /board/view/3
	@PreAuthorize("hasAuthority('BOARD_READ')")
	@GetMapping("/board/{id}")
	public ApiResponse viewBoardDetailPageUserPathVariable(@PathVariable int id) {
		BoardVO boardVO = this.boardService.getOneBoard(id, true);

		return new ApiResponse(boardVO);
	}

	@PreAuthorize("hasAuthority('BOARD_DELETE')")
	@DeleteMapping("/board/{id}")
	public ApiResponse doDeleteOneBoard(@PathVariable int id) {

		BoardDeleteRequestVO boardDeleteRequestVO = new BoardDeleteRequestVO();
		boardDeleteRequestVO.setId(id);
		boardDeleteRequestVO.setEmail(AuthUtil.getEmail());

		boolean isSuccess = this.boardService.deleteOneBoard(boardDeleteRequestVO);
		return new ApiResponse(isSuccess);
	}


	@PreAuthorize("hasAuthority('BOARD_UPDATE')")
	@PutMapping("/board/{id}")
	public ApiResponse doBoardUpdate(@PathVariable int id, @RequestBody BoardUpdateRequestVO boardUpdateRequestVO) {

		boardUpdateRequestVO.setEmail(AuthUtil.getEmail());

		boolean isSuccess = this.boardService.updateOneBoard(boardUpdateRequestVO);

		return new ApiResponse(isSuccess);
	}

}
