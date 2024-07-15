package com.gvacharya.interfacedemo.implementationmain;

import com.gvacharya.interfacedemo.Validator;
import com.gvacharya.interfacedemo.implimentation.NameValid;
import com.gvacharya.interfacedemo.isagevalid.IsAgeValid;
import com.gvacharya.interfacedemo.isemailvalid.IsEmailValid;
import com.gvacharya.interfacedemo.isvalidnumber.IsValidNumber;

public class MainValid {

	public static void main(String[] args) {
		Validator valid = new NameValid();
		
		String name = "Om";
		
		if(valid.isValid(name)) {
			System.out.println("Valid");
		}else {
			System.out.println("invalid");
		}
		
		String number = "9320776929";
		Validator isNumberValid = new IsValidNumber();
		
		if(isNumberValid.isValid(number)) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
		int age = 19;
		Validator isAgeValid = new IsAgeValid();
		if(isAgeValid.isValid(age)) {
			System.out.println("Adult");
		}else {
			System.out.println("Minor");
		}
		
		String email = "jaiswaljatin44@gmail.com";
		
		Validator isEmailValid = new IsEmailValid();
		if(isEmailValid.isValid(email)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
}
