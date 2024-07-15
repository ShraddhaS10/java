package com.gvacharya.swaptwonumbers;

public class SwapTwoNumbers {
	int variable1;
	int variable2;
	int temp;
	
	public SwapTwoNumbers() {
		
	}
	
	public SwapTwoNumbers(int variable1, int variable2) {
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
	

	public void numbersBeforeSwap() {
		System.out.println(variable1);
		System.out.println(variable2);
	}
	
	public void swapTwoNumbersUsingThirdVariable() {
		temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		System.out.println(variable1);
		System.out.println(variable2);
	}
	
	public void swapTwoNumbersWithoutUsingThirdVariable() {
		variable1 = variable1 + variable2;
		variable2 = variable1 - variable2;
		variable1 = variable1 - variable2;
		System.out.println(variable1);
		System.out.println(variable2);
	}
}
