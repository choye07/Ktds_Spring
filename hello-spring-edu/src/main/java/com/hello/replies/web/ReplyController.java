package com.hello.replies.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.hello.common.util.AuthUtil;
import com.hello.common.vo.AjaxResponse;
import com.hello.member.vo.MembersVO;
import com.hello.replies.service.ReplyService;
import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

import jakarta.validation.Valid;

//@Controller
//@ResponseBody //controller에 있는 모든 endpoint는 json을 반환시킨다.
// 두개를 합친 것
@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping("/ajax") // 자동으로앞에 붙이고 시작
public class ReplyController {

	@Autowired
	private ReplyService replyService;

	@PreAuthorize("hasAuthority('REPLY_READ_LIST')")
	@GetMapping("/reply/{boardId}")
	public AjaxResponse getAllReplies(@PathVariable int boardId) {
		List<ReplyVO> replyList = this.replyService.getAllReplies(boardId);
		return new AjaxResponse(replyList);
	}
	@PreAuthorize("hasAuthority('REPLY_CREATE')")
	@PostMapping("/reply/{boardId}")
	public AjaxResponse doCrateNewReply(@Valid ReplyRegistRequestVO replyRegistRequestVO
			,BindingResult bindingResult,
			@PathVariable int boardId) {
		
		if(bindingResult.hasErrors()) {
			//TODO  Validation  Check 결과를 Json으로 돌려주기!
			//????
			
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			
			Map<String, String> errorMap = new HashMap<>();
			
			
			for(ObjectError error: allErrors) {
				//NotEmpty에 들어있는 메세지가 여기로 옴
				String message = error.getDefaultMessage();
				String fieldName="";
				
				
				//해당 에러들을 가져옴.
				
				if(error instanceof FieldError fieldError) {
					fieldName = fieldError.getField();
					
				}
				//bingding한 결과들을 Map으로 묶어서  전달.
				errorMap.put(fieldName, message);
			}
			
			return new AjaxResponse(HttpStatus.BAD_REQUEST.value(),errorMap);
		}
		replyRegistRequestVO.setBoardId(boardId);
		replyRegistRequestVO.setEmail(AuthUtil.getEmail());
	
		boolean isCrate= this.replyService.createNewReply(replyRegistRequestVO);
		
		return new AjaxResponse(HttpStatus.OK.value(),isCrate);
	}
	@PreAuthorize("hasAuthority('REPLY_DELETE')")
	@GetMapping("/reply/delete/{boardId}/{replyId}")
	public AjaxResponse doDeleteOneReply(@PathVariable int boardId, @PathVariable int replyId) {
		
		ReplyDeleteRequestVO replyDeleteRequestVO = new ReplyDeleteRequestVO();
		replyDeleteRequestVO.setBoardId(boardId);
		replyDeleteRequestVO.setReplyId(replyId);
		replyDeleteRequestVO.setEmail(AuthUtil.getEmail());
		
		boolean isDelete = this.replyService.deleteOneReply(replyDeleteRequestVO);
		return new AjaxResponse(isDelete);
	}
	@PreAuthorize("hasAuthority('REPLY_UPDATE')")
	@PostMapping("/reply/modify/{boardId}/{replyId}")
	public AjaxResponse doModifyOneReply(
			@PathVariable int boardId, @PathVariable int replyId
			, @Valid ReplyUpdateRequestVO replyUpdateRequestVO
			, BindingResult bindingResult) {
		
		
		if(bindingResult.hasErrors()) {
			//TODO  Validation  Check 결과를 Json으로 돌려주기!
			//????
			
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			
			Map<String, String> errorMap = new HashMap<>();
			
			
			for(ObjectError error: allErrors) {
				//NotEmpty에 들어있는 메세지가 여기로 옴
				String message = error.getDefaultMessage();
				String fieldName="";
				
				
				//해당 에러들을 가져옴.
				
				if(error instanceof FieldError fieldError) {
					fieldName = fieldError.getField();
					
				}
				//bingding한 결과들을 Map으로 묶어서  전달.
				errorMap.put(fieldName, message);
			}
			
			return new AjaxResponse(HttpStatus.BAD_REQUEST.value(),errorMap);
		}
		
		
		replyUpdateRequestVO.setBoardId(boardId);
		replyUpdateRequestVO.setReplyId(replyId);
		replyUpdateRequestVO.setEmail(AuthUtil.getEmail());
		
		boolean isUpdate = this.replyService.modifyOneReply(replyUpdateRequestVO);
		
		return new AjaxResponse(isUpdate);
	}
	@PreAuthorize("hasAuthority('REPLY_RECOMMEND')")
	@GetMapping("/reply/recommend/{boardId}/{replyId}")
	public AjaxResponse doRecommendOneReply(
			@PathVariable int boardId, @PathVariable int replyId) {
		ReplyRecommendRequestVO replyRecommendRequestVO = new ReplyRecommendRequestVO();
		replyRecommendRequestVO.setBoardId(boardId);
		replyRecommendRequestVO.setReplyId(replyId);
		replyRecommendRequestVO.setEmail(AuthUtil.getEmail());
		
		int recommend = this.replyService.recommendOneReply(replyRecommendRequestVO);
		
		return new AjaxResponse(recommend);
	}
}