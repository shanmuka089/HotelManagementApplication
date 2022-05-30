package com.htm.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.htm.annotations.CheckId;



public class CheckIdValidator implements ConstraintValidator<CheckId, Integer>{

	private String len;
	@Override
	public void initialize(CheckId id) {
//		i can wrie the post construct here
		this.len=id.len();
	}
	
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		
		String s=value+"";
		
		if(!(s.length()==len.length()))
			return false;
		else 
			return true;
	}

}
