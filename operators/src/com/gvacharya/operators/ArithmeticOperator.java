package com.gvacharya.operators;

public class ArithmeticOperator {

	// variable instance
	float operand1;
	float operand2;
	
	public ArithmeticOperator() {
		
	}
	//variable shadowing - local variable dominates global/instance variable. To solve this issue this keyword is used to refer global variable..
	public ArithmeticOperator(float operand1, float operand2) {
		//variable shadowing
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public float getOperand1() {
		return operand1;
	}
	
	public void setOperator1(float operand1) {
		this.operand1=operand1;
	}
	
	
	public float getOperand2() {
		return operand2;
	}
	
	public void setOperator2(float operand2) {
		this.operand2=operand2;
	}
	
	public float addTwoOperands() {
		return operand1+operand2;
	}
	
	public float substractTwoOperands() {
		return operand1-operand2;
	}
	
	public int multiplyTwoOperands() {
		return (int)operand1*(int)operand2;
	}

	public float divideTwoOperands() {
		return operand1/operand2;
	}
	
	public float moduleTwoOperands() {
		return operand1%operand2;
	}
}
