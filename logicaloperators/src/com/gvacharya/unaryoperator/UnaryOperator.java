package com.gvacharya.unaryoperator;

public class UnaryOperator {

	private int variable1;
	
	public UnaryOperator() {
		
	}
	
	public UnaryOperator(int variable1) {
		this.variable1 = variable1;
	}
	
	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}
	
	public int getVariable1() {
		return variable1;
	}
	
	public int preIncrementOperation() {
		return ++variable1;
	}
	
	public int postIncrementOperation() {
		return variable1++;
	}
	
	public int preDecrementOperation() {
		return --variable1;
	}
	
	public int postDecrementOperation() {
		return variable1--;
	}
}

