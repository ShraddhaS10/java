package com.gvacharya.arthematicoperation;

import java.util.Scanner;

public class ArthematicOperation {
	
	Scanner scanner = new Scanner(System.in);
	
	private int intA;
	private int intB;
	
	public ArthematicOperation() {
		
	}
	
	public ArthematicOperation(int intA, int intB) {
		this.intA = intA;
		this.intB = intB;
	}
	
	public void setIntA(int intA) {
		this.intA = intA;
	}
	
	public void setIntB(int intB) {
		this.intB = intB;
	}
	
	public int getIntA() {
		return intA;
	}
	
	public int getIntB() {
		return intB;
	}
	
	public int addition() {
		return intA + intB;
	}
	
	public int substraction() {
		return intA - intB;
	}
	
	public int multiplication() {
		return intA * intB;
	}
	
	public int division() {
		return intA / intB;
	}
	
	public int modulus() {
		return intA % intB;
	}
	
	public int powerOfA() {
		System.out.println("Enter exponent value:");
		int exponent = scanner.nextInt();
		double result = Math.pow((double)intA,exponent);
		return (int)result;
	}
	
	public int powerOfB() {
		System.out.println("Enter exponent value:");
		int exponent = scanner.nextInt();
		double result = Math.pow((double)intB,exponent);
		return (int)result;
	}
}
