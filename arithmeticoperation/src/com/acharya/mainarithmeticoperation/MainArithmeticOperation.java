package com.acharya.mainarithmeticoperation;
import com.acharya.arithmeticoperation.ArithmeticOperationService;

public class MainArithmeticOperation{

	public static void main(String[] args) {
		ArithmeticOperationService obj = new ArithmeticOperationService();
		
		System.out.println(obj.addService());
		System.out.println(obj.subService());
		System.out.println(obj.mulService());
	}
}
