package com.gvacharya.interfaces.demo.implementation;

import com.gvacharya.interfaces.demo.Validator;

public class ValidMobileNumber implements Validator{

	@Override
	public boolean isValid(String number) {
//		if(number.matches("[6-9][0-9]{9}"))
//			return true;
//		return false;
		return number.matches("[6-9][0-9]{9}")? true : false;
		
	}
	
}
