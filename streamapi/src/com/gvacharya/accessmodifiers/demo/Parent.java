package com.gvacharya.accessmodifiers.demo;

public class Parent {

	public int number;
	
	public Parent() {}
	
	public void parentShow() {
		System.out.println("Parent Show");
		
		int number2;
	}
	
	public void parentShowTest() {
		parentShow();
		number=10;
	}
	
}
