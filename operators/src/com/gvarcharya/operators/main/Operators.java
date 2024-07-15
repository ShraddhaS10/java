package com.gvarcharya.operators.main;
import com.gvacharya.operators.ArithmeticOperator;


public class Operators {
	public static void main(String[] args) {
		ArithmeticOperator arithmeticOperators = new ArithmeticOperator(10,6);
		
		float additionResult = arithmeticOperators.addTwoOperands();
		
		System.out.println(additionResult);
		
		int multiplicationResult = arithmeticOperators.multiplyTwoOperands();
		
		System.out.println(multiplicationResult);
		
		float substractionResult = arithmeticOperators.substractTwoOperands();
		
		System.out.println(substractionResult);
		
		float divisionResult = arithmeticOperators.divideTwoOperands();
		
		System.out.println(divisionResult);
		
		float moduleResult = arithmeticOperators.moduleTwoOperands();
		
		System.out.println(moduleResult);
		System.out.println(arithmeticOperators.getOperand1());
		}
}
