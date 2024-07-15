package com.gvacharya.interfaces.demo.implementation;

import com.gvacharya.interfaces.demo.Validator;

public class ValidAge implements Validator{

	@Override
	public boolean isValid(String age) {
		int age1=Integer.parseInt(age);
		if(age1>0)
			return true;
		else 
			return false;
	}
}

