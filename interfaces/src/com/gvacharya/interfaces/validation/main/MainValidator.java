package com.gvacharya.interfaces.validation.main;

import com.gvacharya.interfaces.validation.Validator;

public class MainValidator {

	public static void main(String[] args) {
		
		Validator validate = new Validator() {
			@Override
			public boolean validateAge(int age) {
				return (age>18?true:false);
			}
			
			@Override
			public boolean validateName(String name) {
				return name.matches("[A-Z][a-z]{1,9}");
			}
			
			@Override
			public boolean validateEmailId(String email) {
				return (email.matches("[a-z][a-z 0-9]*@[a-z]*.[a-z]*")?true:false);
						
			}
			
			@Override
			public boolean validateNumber(String number) {
				return (number.matches("[6-9][0-9]{9}")?true:false);
			}
		};
		
		String name="Abc";
		
		if(validate.validateName(name)) 
			System.out.println(name + " valid name");
		else
			System.out.println(name + " invalid name");
		
		
		String email="a123@adf.in";
		
		if(validate.validateEmailId(email))
			System.out.println(email + " valid email");
		else
			System.out.println(email + " invalid email");
		
		int age=19;
		if(validate.validateAge(age))
			System.out.println(age + " valid age");
		else
			System.out.println(age + " invalid age");
		
		String mobile="6237652390";
		if(validate.validateNumber(mobile))
			System.out.println(mobile + " is valid");
		else
			System.out.println(mobile + " is invalid");
	}
}
