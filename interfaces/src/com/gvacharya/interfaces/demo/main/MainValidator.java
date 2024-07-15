package com.gvacharya.interfaces.demo.main;

import com.gvacharya.interfaces.demo.Validator;
import com.gvacharya.interfaces.demo.implementation.ValidAge;
import com.gvacharya.interfaces.demo.implementation.ValidMobileNumber;
import com.gvacharya.interfaces.demo.implementation.ValidNames;

public class MainValidator {

	public static void main(String[] args) {
		Validator validateName = new ValidNames();
		
		String name = "Om";
		
		if(validateName.isValid(name))
			System.out.println(name + " is valid Property");
		else
			System.out.println(name + " is invalid property");
		
		
		String number="8712312323";
		
		Validator validateNumber = new ValidMobileNumber();
		if(validateNumber.isValid(number))
			System.out.println(number + " is Valid Number");
		else
			System.out.println(number + " is invalid mobile number");
		
		Validator ageValidate = new ValidAge();
		String age = "23";
		
		if(ageValidate.isValid(age))
			System.out.println(age + " is a valid age");
		else
			System.out.println(age + " is a invalid age");
		
	}
}
