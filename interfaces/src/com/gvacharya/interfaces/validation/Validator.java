package com.gvacharya.interfaces.validation;

public interface Validator {

	boolean validateName(String name);
	
	boolean validateNumber(String number);
	
	boolean validateAge(int age);
	
	boolean validateEmailId(String email);
}
