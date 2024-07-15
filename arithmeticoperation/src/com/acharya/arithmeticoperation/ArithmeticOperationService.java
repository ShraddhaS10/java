package com.acharya.arithmeticoperation;

public class ArithmeticOperationService {
	
		ArithmeticOperation obj = new ArithmeticOperation(10,20);
	
	public int addService() {
		return obj.Add();
	}

	public int subService() {
		return obj.Sub();
	}

	public int mulService() {
		return obj.Mul();
	}
	
	
}
