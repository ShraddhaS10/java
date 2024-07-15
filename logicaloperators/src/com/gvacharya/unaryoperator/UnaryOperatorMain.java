package com.gvacharya.unaryoperator;

public class UnaryOperatorMain {
	public static void main(String[] args) {
		UnaryOperator unaryOperation = new UnaryOperator(5);
		
		
		System.out.println(unaryOperation.postIncrementOperation());
		System.out.println(unaryOperation.getVariable1());
		System.out.println(unaryOperation.preIncrementOperation());
		System.out.println(unaryOperation.getVariable1());
		System.out.println(unaryOperation.postDecrementOperation());
		System.out.println(unaryOperation.getVariable1());
		System.out.println(unaryOperation.preDecrementOperation());
		System.out.println(unaryOperation.getVariable1());
		
	}
}
