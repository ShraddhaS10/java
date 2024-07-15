package com.gvacharya.bitwiseoperator;

public class BitwiseOperatorMain {
	public static void main(String[] args) {
		BitwiseOperator bitwiseOperator = new BitwiseOperator();
		
		bitwiseOperator.setVariable1(-5);
		bitwiseOperator.setVariable2(-3);
		
		System.out.println(bitwiseOperator.andOperation());
		System.out.println(bitwiseOperator.orOperation());
		System.out.println(bitwiseOperator.xorOperation());
		System.out.println(bitwiseOperator.leftShiftOperation());
		System.out.println(bitwiseOperator.rightShiftOperation());
		System.out.println(bitwiseOperator.unsignedRightShiftOperation());
	}
}
