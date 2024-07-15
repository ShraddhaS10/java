package com.gvacharya.interfaces.validationmain;

import com.gvacharya.interfaces.validation.Validation;

public class MainValidator {

	public static void main(String[] args) {
		
		Validation validator = new Validation() {
			
			@Override
			public boolean ValidateName(String name) {
				return (name.length()>8?true:false);
			}
			
			@Override
			public boolean ValidateNumber(String number) {
				return (number.matches("[0-6][5-9]{9}")?true:false);
			}
			
			@Override
			public boolean ValidateAge(int age) {
				return (age>18?true:false);
			}
			
			@Override
			public boolean ValidateEmail(String email) {
				return (email.matches("[a-z][a-z 0-9]*@[a-z]*.[a-z]*")?true:false);
			}
		};
		
		String name = "lenovo";
		
		if(validator.ValidateName(name)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		String email = "jaiswaljatin44@gmail.com";
		
		if(validator.ValidateEmail(email)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		String number = "9307762964";
		
		if(validator.ValidateNumber(number)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		int age = 19;
		
		if(validator.ValidateAge(age)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	
	
	

}
	
