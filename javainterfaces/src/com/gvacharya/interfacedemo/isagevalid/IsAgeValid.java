package com.gvacharya.interfacedemo.isagevalid;

import com.gvacharya.interfacedemo.Validator;

public class IsAgeValid implements Validator{

	@Override
	public boolean isValid(int age) {
		return (age>18?true:false);
	}

	@Override
	public boolean isValid(String property) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
