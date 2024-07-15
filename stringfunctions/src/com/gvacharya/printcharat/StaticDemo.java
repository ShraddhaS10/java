package com.gvacharya.printcharat;

public class StaticDemo {
	
	static {
		System.out.println("Static block");
		// used to initialize static variable. 
		// why use?
		// other than initialization, MEMORY MANAGEMENT.
		// what are static variable?
		// class variable are also known as static variable.
		// vairables' one value is shared among all variables.
		// instance variable are objects' variable and constructor are used for the purpose of initialization.
		
		// static block is executed before main method to initialize static variable .
	
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
	}
}

	//static Methods
	//-> public static void methodName(){}
	//why use?
	// Memory Management. no need to create object.
	// static method mein object ka variable access karne ke liye object reference use karna padta hain.