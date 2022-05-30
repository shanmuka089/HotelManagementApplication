package com.htm.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.htm.annotations.CheckId;
import com.htm.annotations.CheckPhone;

public class PhoneNumberValidator implements ConstraintValidator<CheckPhone, String>{

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value.startsWith("91") && value.length()==12) {
			return true;
		}else if(!value.startsWith("91") && value.length()==10) {
			return true;
		}return false;
	}

}
