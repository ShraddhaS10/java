package com.gvacharya.logicaloperators.main;
import com.gvacharya.logicaloperators.LogicalOperators;

public class LogicalOperatorMain {
	public static void main(String[] args) {
		LogicalOperators logicalOperations = new LogicalOperators(5,4);
		
		boolean isEqualResult = logicalOperations.isEqual();
		
		System.out.println(isEqualResult);
		
		boolean isNotEqualResult = logicalOperations.isNotEqualTo();
		
		System.out.println(isNotEqualResult);
		
		boolean isLessResult = logicalOperations.isLess();
		
		System.out.println(isLessResult);
		
		boolean isGreaterResult = logicalOperations.isGreater();
		
		System.out.println(isGreaterResult);
		
		boolean isLessThanEqualResult = logicalOperations.isLessThanEqualTo();
		
		System.out.println(isLessThanEqualResult);
		
		boolean isGreaterThanEqualResult = logicalOperations.isGreaterThanEqualTo();
		
		System.out.println(isGreaterThanEqualResult);
		
		//not 
		if(!(10>5)) {
			System.out.println("it 10 is greater than 5");
		}
		
		if((10<20) && (20>15)) {
			System.out.println("only both expression are true");
		}
		
		if((10>20) || (15<20)) {
			System.out.println("only if any expression are true");
		}
		
		int result=0;
		result = result + 10;
		result += 10;
	}
}
