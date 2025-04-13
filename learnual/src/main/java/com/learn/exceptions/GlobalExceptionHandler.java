package com.learn.exceptions;

import org.jboss.logging.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(MemberLoginException.class)
	public String viewMemberLogingExceptionPage(MemberLoginException mle, Model model) {

		LOGGER.debug(mle.getMessage());
//		model.addAttribute("userInput", mle.memberLoginRequestVO());
		model.addAttribute("errorMessage", mle.getMessage());
		return "member/memberlogin";
	}

//	@ExceptionHandler(MemberRegistException.class)
//	public String viewMemberRegistExceptionPage(MemberRegistRequestVO memberRegistRequestVO, MemberRegistException mre,
//			Model model) {
//		LOGGER.debug(mre.getMessage());
//		model.addAttribute("emailErrorMessage", mre.getMessage());
//		model.addAttribute("userInputRegist", mre.getMemberRegistRequestVO());
//		return "member/memberregist";
//
//	}

	@ExceptionHandler(PageNotFoundException.class)
	public String viewPageNotFoundExceptionPage(PageNotFoundException pnfe, Model model) {
		LOGGER.debug(pnfe.getMessage());
		model.addAttribute("cause", pnfe.getMessage());

		return "error/404";
	}

	@ExceptionHandler(NotExistsException.class)
	public String viewNotExistsExceptionpage(NotExistsException nee, Model model) {
		LOGGER.debug(nee.getMessage());
		model.addAttribute("cause", nee.getMessage());

		return "error/404";
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String viewNoHandlerFoundExceptionPage(NoHandlerFoundException ngfe) {
		return "error/404";
	}
	
	
	//항상 끝에 있어야한다.
	//제일 위에 있어버리면 모든 exception을 다 먹어버리기 때문에 항상 무조건 맨 끝에 적어줘야한다.
	@ExceptionHandler(RuntimeException.class)
	public String viewOtherExceptionPage(RuntimeException re) {
		LOGGER.debug(re.getMessage());
		
		return "error/500";
	}
	

}
