package com.gvacharya.expressionstatement;

public class PrintExpression {

	public PrintExpression() {
		
	}
	
	public void printExpression(String expression, int no) {

		if (no <= 0) {
			System.out.println(expression);
			return;
		}

		if (expression.equals("")) {
			expression = no + "";
		} else {
			expression = expression + "+" + no;
		}

		switch (no) {

		case 1:
			printExpression(expression, no - 1);
			break;

		default: {
			printExpression(expression, no - 1);
			printExpression(expression, no - 2);
		}
		break;
		
		}
	}
} 

// any data type value can be converted into  string datatype by using -> message + ""