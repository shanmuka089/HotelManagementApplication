package com.htm.globalExceptionHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String arithmeticException(Exception e,Model model) {
		model.addAttribute("exception", e);
		return "errorPage";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String nullpointerException(Exception e,Model model) {
		model.addAttribute("exception", e);
		return "errorPage";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exception(Exception e,Model model) {
		model.addAttribute("exception", e);
		return "errorPage";
		}
}
