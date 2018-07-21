package com.proman.web.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenericValidator implements
ConstraintValidator<ContactNumberConstraint, String> {

	@Override
	public void initialize(ContactNumberConstraint arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return value != null && !value.isEmpty();
	}
	
}