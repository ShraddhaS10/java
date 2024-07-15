package com.gvacharya.interfaces.demo.implementation;

import com.gvacharya.interfaces.demo.Validator;

public class ValidNames implements Validator{

	@Override
	public boolean isValid(String property) {
//		if(property.length()>8)
//			return true;
//
//		
//		return false;	
		return (property.length()>8?true:false);
			
	}
}
