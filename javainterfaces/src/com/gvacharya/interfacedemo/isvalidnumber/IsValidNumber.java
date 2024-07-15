package com.gvacharya.interfacedemo.isvalidnumber;

import com.gvacharya.interfacedemo.Validator;

public class IsValidNumber implements Validator{

	@Override
	public boolean isValid(String number) {
		return (number.matches("[6-9][0-9]{9}")?true:false);
	}

	@Override
	public boolean isValid(int age) {
		// TODO Auto-generated method stub
		return false;
	}
}
