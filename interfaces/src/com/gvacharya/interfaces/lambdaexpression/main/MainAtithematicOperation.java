package com.gvacharya.interfaces.lambdaexpression.main;

import com.gvacharya.interfaces.lambdaexpression.ArithematicOperation;

public class MainAtithematicOperation {

	public static void main(String[] args) {
		ArithematicOperation addition = (number1, number2) -> number1+number2;
		
		ArithematicOperation substraction = (number1, number2) -> number1-number2;
		
		ArithematicOperation multiplication = (number1, number2) -> number1*number2;
		
		ArithematicOperation division = (number1, number2) -> number1/number2;
		
		ArithematicOperation modulo = (number1, number2) -> number1%number2;
		
		System.out.println(addition.operation(10, 20));
		System.out.println(substraction.operation(10, 20));
		System.out.println(multiplication.operation(10, 20));
		System.out.println(division.operation(10, 20));
		System.out.println(modulo.operation(10, 20));		
	}
}
