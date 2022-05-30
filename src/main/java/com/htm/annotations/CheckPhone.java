package com.htm.annotations;

import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.htm.validators.PhoneNumberValidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface CheckPhone {
	
	
	String message() default "* please enter valid phone number";
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
