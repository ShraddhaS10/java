package com.gvacharya.interfaces.lamdaexpression.maiin;

import com.gvacharya.interfaces.lambdaexpression.ArithematicOperation;

public class MainArithematicOperation {

	public static void main(String[] args) {
		//object creation of abstract class /functional interface using Anonymous class
//		ArithematicOperation addition = new ArithematicOperation() {
//			
//			@Override
//			public int Operation(int number1, int number2) {
//				return number1+number2;
//			}
//			
//		};
		// object creation using lambda expression
		ArithematicOperation addition = (number1,number2) ->number1+number2;
		
		ArithematicOperation substraction = (number1,number2) ->number1-number2; 
		
		ArithematicOperation multiplication = (number1,number2) ->number1*number2; 
		
		ArithematicOperation division = (number1,number2) ->(int)number1/number2;
		
		ArithematicOperation modulo = (number1,number2) ->number1%number2; 
		
		System.out.println(addition.Operation(10,20));
		System.out.println(substraction.Operation(10, 20));
		System.out.println(multiplication.Operation(10, 20));
		System.out.println(division.Operation(10, 20));
		System.out.println(modulo.Operation(10, 20));
	}
	
	
}
// lambdaexpression can be only used with functional expression.
// no need of access modifier, method  name, return type for lambdaexpression