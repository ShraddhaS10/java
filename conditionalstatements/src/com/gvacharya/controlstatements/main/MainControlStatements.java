package com.gvacharya.controlstatements.main;
import com.gvacharya.controlstatements.ControlStatements;

public class MainControlStatements {

	public static void main(String[] args) {
		
		int variable1=10;
		int variable2=15;
		int variable3=20;
		int variable4=90;
		
		ControlStatements controlStatement = new ControlStatements(variable1==variable2);
		
		ControlStatements controlStatement1 = new ControlStatements();
		
		ControlStatements controlStatement2 = new ControlStatements();
		
		ControlStatements controlStatement3 = new ControlStatements();
		
		controlStatement1.setExpression((variable1<variable2) && (variable1 < variable3));
		
//		controlStatement.testIf();
//		
//		controlStatement1.testIf()
		
		controlStatement.testIfElse();

		controlStatement1.testIfElse();
		
		
		
		char result = controlStatement2.testElseIfLadder(variable4);
		System.out.println("result:"+result);
		
		
		controlStatement3.testSwitch(result);
		
		
	}
}