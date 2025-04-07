package com.hello.replies.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.hello.common.vo.AjaxResponse;
import com.hello.member.vo.MembersVO;
import com.hello.replies.service.ReplyService;
import com.hello.replies.service.impl.ReplyServiceImpl;
import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

import jakarta.validation.Valid;

//@Controller
//@ResponseBody //controller에 있는 모든 endpoint는 json을 반환시킨다.
// 두개를 합친 것
@RestController 
public class ReplyController {

    private final ReplyServiceImpl replyServiceImpl;

	@Autowired
	private ReplyService replyService;

    ReplyController(ReplyServiceImpl replyServiceImpl) {
        this.replyServiceImpl = replyServiceImpl;
    }

	@GetMapping("/reply/{boardId}")
	public AjaxResponse getAllReplies(@PathVariable int boardId) {
		List<ReplyVO> replyList = this.replyService.getAllReplies(boardId);
		return new AjaxResponse(replyList);
	}
	
	@PostMapping("/reply/{boardId}")
	public AjaxResponse doCrateNewReply(@Valid ReplyRegistRequestVO replyRegistRequestVO
			,BindingResult bindingResult,
			@PathVariable int boardId,
			@SessionAttribute("__LOGIN_USER__") MembersVO memberVO
			) {
		
		if(bindingResult.hasErrors()) {
			//TODO  Validation  Check 결과를 Json으로 돌려주기!
			//????
			
			return new AjaxResponse(HttpStatus.BAD_REQUEST.value(),null);
		}
		replyRegistRequestVO.setBoardId(boardId);
		replyRegistRequestVO.setEmail(memberVO.getEmail());
	
		boolean isCrate= this.replyService.createNewReply(replyRegistRequestVO);
		
		return new AjaxResponse(HttpStatus.OK.value(),isCrate);
	}

	@GetMapping("/reply/delete/{boardId}/{replyId}")
	public AjaxResponse doDeleteOneReply(@PathVariable int boardId, @PathVariable int replyId
										, @SessionAttribute("__LOGIN_USER__") MembersVO memberVO) {
		
		ReplyDeleteRequestVO replyDeleteRequestVO = new ReplyDeleteRequestVO();
		replyDeleteRequestVO.setBoardId(boardId);
		replyDeleteRequestVO.setReplyId(replyId);
		replyDeleteRequestVO.setEmail(memberVO.getEmail());
		
		boolean isDelete = this.replyService.deleteOneReply(replyDeleteRequestVO);
		return new AjaxResponse(isDelete);
	}
	
	@PostMapping("/reply/modify/{boardId}/{replyId}")
	public AjaxResponse doModifyOneReply(
			@PathVariable int boardId, @PathVariable int replyId
			, @Valid ReplyUpdateRequestVO replyUpdateRequestVO
			, BindingResult bindingResult
			, @SessionAttribute("__LOGIN_USER__") MembersVO memberVO) {
		
		if(bindingResult.hasErrors()) {
			
			return new AjaxResponse(HttpStatus.BAD_REQUEST.value(),null);
		}
		
		
		replyUpdateRequestVO.setBoardId(boardId);
		replyUpdateRequestVO.setReplyId(replyId);
		replyUpdateRequestVO.setEmail(memberVO.getEmail());
		
		boolean isUpdate = this.replyService.modifyOneReply(replyUpdateRequestVO);
		
		return new AjaxResponse(isUpdate);
	}
	
	@GetMapping("/reply/recommend/{boardId}/{replyId}")
	public AjaxResponse doRecommendOneReply(
			@PathVariable int boardId, @PathVariable int replyId,
			@SessionAttribute("__LOGIN_USERS__") MembersVO memberVO) {
		ReplyRecommendRequestVO replyRecommendRequestVO = new ReplyRecommendRequestVO();
		replyRecommendRequestVO.setBoardId(boardId);
		replyRecommendRequestVO.setReplyId(replyId);
		replyRecommendRequestVO.setEmail(memberVO.getEmail());
		
		boolean recommend = this.replyService.recommendOneReply(replyRecommendRequestVO);
		
		return new AjaxResponse(recommend);
	}
}