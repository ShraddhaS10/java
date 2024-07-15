package com.gvacharya.logicaloperators;

public class LogicalOperators {
	//define variable instance
	int operand1;
	int operand2;
	
	//Define Constructor
	public LogicalOperators() {
		
	}
	
	public LogicalOperators(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	
	public int getOperand2() {
		return operand2;
	}
	
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	
	public boolean isEqual() {
		return operand1 == operand2;
	}
	
	public boolean isGreater() {
		return operand1 > operand2;
	}
	
	public boolean isLess() {
		return operand1 < operand2;
	}
	
	public boolean isLessThanEqualTo() {
		return operand1 <= operand2;
	}
	
	public boolean isGreaterThanEqualTo() {
		return operand1 >= operand2;
	}
	
	public boolean isNotEqualTo() {
		return operand1 != operand2;
	}
}
 