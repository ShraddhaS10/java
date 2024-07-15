package com.gvacharya.definingarray;

public class LeftRotate {

	public static void main(String[] args) {

		int[] rotateElement = { 10, 20, 30, 40, 50 };
		int firstElement = rotateElement[0];
		
		//before rotation of array
		for (int i = 0; i < rotateElement.length; i++)
			System.out.println(rotateElement[i]);
		
		System.out.println();
		
		// LOGIC 1
		for (int i = 0; i < rotateElement.length - 1; i++) 
			rotateElement[i] = rotateElement[i + 1];
		
		rotateElement[rotateElement.length - 1] = firstElement; 
		
		// LOGIC 2
		//another logic
		//		a= a+b;
		//		b= a-b;
		//		a= a-b;

		// after rotation of array
		for (int i = 0; i < rotateElement.length; i++)
			System.out.println(rotateElement[i]);
	}
}
