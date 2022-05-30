package com.htm.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.htm.validators.CheckIdValidator;

@Documented
@Retention(value =RetentionPolicy.RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = CheckIdValidator.class)
public @interface CheckId {
	
	String message() default  "* these field must contains 5 digits only";
	
	String len() default "*****";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
