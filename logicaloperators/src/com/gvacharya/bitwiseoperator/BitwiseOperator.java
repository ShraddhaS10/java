package com.gvacharya.bitwiseoperator;

public class BitwiseOperator {
	
	private int variable1;
	private int variable2;
	
	public BitwiseOperator() {
		
	}
	
	public BitwiseOperator(int variable1, int variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	
	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}
	
	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}
	
	public int getVariable1() {
		return variable1;
	}
	
	public int getVariable2() {
		return variable2;
	}
	
	public int andOperation() {
		return variable1&variable2;
	}
	
	public int orOperation() {
		return variable1|variable2;
	}
	
	public int xorOperation() {
		return variable1^variable2;
	}
	
	public int leftShiftOperation() {
		return variable1<<1;
	}
	
	public int rightShiftOperation() {
		return variable2>>1;
	}
	
	public int unsignedRightShiftOperation() {
		return variable2>>>1;
	}
}
