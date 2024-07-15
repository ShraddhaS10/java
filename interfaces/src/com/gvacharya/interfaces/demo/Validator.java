package com.gvacharya.interfaces.demo;

public interface Validator {
	
	int number=0;
	


	// Abstract Method
	boolean isValid(String property);
	
	
	// static method valid after java 1.8 version
	public static void printHello() {
		System.out.println("Hello");
	}
	
	// private method valid after java 1.8 version
	private int returnAge(int age) {
		return age;
	}
	
	
	// default method valid after java 1.8 version
	public default void printHi() {
		System.out.println("Hi");
	}
	
}
