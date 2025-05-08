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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.common.util.AuthUtil;
import com.hello.common.vo.ApiResponse;
import com.hello.replies.service.ReplyService;
import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

import jakarta.validation.Valid;

@PreAuthorize("isAuthenticated()")
@RestController // (@Controller + @ResponseBody)
@RequestMapping("/api/v1")
public class ReplyApiController {

    @Autowired
    private ReplyService replyService;
    
    // http://localhost:8080/reply/{boardId}
    @PreAuthorize("hasAuthority('REPLY_READ_LIST')")
    @GetMapping("/reply/{boardId}")
    public ApiResponse getAllReplies(@PathVariable int boardId) {
    	List<ReplyVO> replyList = this.replyService.getAllReplies(boardId);
    	return new ApiResponse(replyList);
    }
    
    // http://localhost:8080/reply/{boardId}
    @PreAuthorize("hasAuthority('REPLY_CREATE')")
    @PostMapping("/reply/{boardId}")
    public ApiResponse doCreateNewReply(
    			@Valid @RequestBody ReplyRegistRequestVO replyRegistRequestVO,
    			BindingResult bindingResult,
    			@PathVariable int boardId
    		) {
    	
    	if (bindingResult.hasErrors()) {
    		return new ApiResponse(bindingResult.getFieldErrors());
    	}
    	
    	replyRegistRequestVO.setBoardId(boardId);
    	replyRegistRequestVO.setEmail(AuthUtil.getEmail());
    	
    	boolean isCreate = this.replyService.createNewReply(replyRegistRequestVO);
    	
    	return new ApiResponse(HttpStatus.OK.value(), isCreate);
    }
    
    // http://localhost:8080/reply/delete/{boardId}/{replyId}
    @PreAuthorize("hasAuthority('REPLY_DELETE')")
    @DeleteMapping("/reply/{boardId}/{replyId}")
    public ApiResponse doDeleteOneReply(
    			@PathVariable int boardId,
    			@PathVariable int replyId
    		) {
    	ReplyDeleteRequestVO replyDeleteRequestVO = new ReplyDeleteRequestVO();
    	replyDeleteRequestVO.setBoardId(boardId);
    	replyDeleteRequestVO.setReplyId(replyId);
    	replyDeleteRequestVO.setEmail(AuthUtil.getEmail());
    	
    	boolean isDelete = this.replyService.deleteOneReply(replyDeleteRequestVO);
    	
    	return new ApiResponse(isDelete);
    }
    
    @PreAuthorize("hasAuthority('REPLY_UPDATE')")
    @PutMapping("/reply/{boardId}/{replyId}")
    public ApiResponse doModifyOneReply(
    			@PathVariable int boardId,
    			@PathVariable int replyId,
    			@Valid @RequestBody ReplyUpdateRequestVO replyUpdateRequestVO,
    			BindingResult bindingResult
    		) {
    	
    	if (bindingResult.hasErrors()) {
    		return new ApiResponse(bindingResult.getFieldErrors());
    	}
    	
    	replyUpdateRequestVO.setBoardId(boardId);
    	replyUpdateRequestVO.setReplyId(replyId);
    	replyUpdateRequestVO.setEmail(AuthUtil.getEmail());
    	
    	boolean isUpdate = this.replyService.modifyOneReply(replyUpdateRequestVO);
    	return new ApiResponse(isUpdate);
    }
    
    @PreAuthorize("hasAuthority('REPLY_RECOMMEND')")
    @GetMapping("/reply/recommend/{boardId}/{replyId}")
    public ApiResponse doRecommendOneReply(
             @PathVariable int boardId,
             @PathVariable int replyId
          ) {
       
       ReplyRecommendRequestVO replyRecommendRequestVO = new ReplyRecommendRequestVO();
       replyRecommendRequestVO.setBoardId(boardId);
       replyRecommendRequestVO.setReplyId(replyId);
       replyRecommendRequestVO.setEmail(AuthUtil.getEmail());
       
       int recommendCount = this.replyService.recommendOneReply(replyRecommendRequestVO);
       return new ApiResponse(recommendCount);
    }
}









