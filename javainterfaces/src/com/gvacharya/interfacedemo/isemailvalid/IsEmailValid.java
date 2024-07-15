package com.gvacharya.interfacedemo.isemailvalid;

import com.gvacharya.interfacedemo.Validator;

public class IsEmailValid implements Validator{

	@Override
	public boolean isValid(String property) {
		return (property.matches("[a-z][a-z 0-9]*@[a-z]*.[a-z]*")?true:false);
	}

	@Override
	public boolean isValid(int age) {
		// TODO Auto-generated method stub
		return false;
	}
}
// '.' - zero or more
// '*' - one or more
// 