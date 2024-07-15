package com.acharya.arithmeticoperation;

public class ArithmeticOperation {
		
	// create instance variable
		int operand1;
		int operand2;
		int result;
		
	
	//create default constructor
		ArithmeticOperation(int num1,int num2) {
			operand1 = num1;
			operand2 = num2;
		}
	
	//default addition method
		int Add() {
			result = operand1 + operand2;
			return result;
			
		}
	
	//default addition method
		int Sub(){
			result = operand1 - operand2;
			return result;
			
		}
		
	//default addition method	
		int Mul(){
			result = operand1 * operand2;
			return  result;
		}
				
}
