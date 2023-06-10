package com.core.java.customException;


//@RestContrllerAdvice
public class GlobalException {

	//@ExceptionHandler(invalidAgeException.class)
	public String invalidAge(invalidAgeException ia) {
		
		String msg=ia.getMsg();
		
		
		return msg;
		
	}
	
}
