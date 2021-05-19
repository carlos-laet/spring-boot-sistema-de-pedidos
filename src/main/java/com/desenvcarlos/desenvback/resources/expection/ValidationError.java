package com.desenvcarlos.desenvback.resources.expection;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StantardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	
	public ValidationError(Integer status, String msg, Long timesTamp) {
		super(status, msg, timesTamp);
	}


	public List<FieldMessage> getErrors() {
		return errors;
	}


	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}

	

}