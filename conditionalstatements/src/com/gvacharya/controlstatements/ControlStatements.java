package com.gvacharya.controlstatements;

public class ControlStatements {
	
	private boolean expression;
	
	public ControlStatements() {
		
	}
	
	public ControlStatements(boolean expression) {
		this.expression = expression;
		
	}
	
	public void setExpression(boolean expression) {
		this.expression = expression;
	}
	
	public boolean getExpression() {
		return expression;
	}

	public void testIf() {
		if(expression) {
			System.out.println("If Block");
		}
	}
	
	public void testIfElse() {
		if(expression) {
			System.out.println("If Block");
		} else {
			System.out.println("Else Block");
		}
	}
	
	public char testElseIfLadder(int marks) {
		if(marks >= 90) {
			return 'A';				
		}else if(marks >= 80) {
			return 'B';
		}else if(marks >= 70) {
			return 'C';
		}else if(marks >= 60) {
			return 'D';
		}else if(marks >= 50) {
			return 'E';
		}else {
			return 'F';
		}
	}
	
	public void testSwitch(char character) {
		switch(character) {

		case 'A': System.out.println("A grade- Passed with marks above 90%");
					break;
		
		case 'B': System.out.println("B grade Passed with marks above 80%");
					break;
					
		case 'C': System.out.println("C grade Passed with marks above 70%");
					break;
					
		case 'D': System.out.println("D grade Passed with marks above 60%");
					break;
					
		case 'E': System.out.println("E grade Passed with marks above 50%");
					break;
		
		case 'F': System.out.println("F grade Failed");
					break;
		
		default: System.out.println("Entered Invalid Character.");
		}
	}
}
