package com.gvacharya.interfacedemo.implimentation;

import com.gvacharya.interfacedemo.Validator;

public class NameValid implements Validator{

	@Override
	public boolean isValid(String property) {
//		if(property.length() > 0) {
//			return true;
//		}
//		return false;
		return (property.length()>8?true:false);
		
	}

	@Override
	public boolean isValid(int age) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
