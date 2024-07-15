package com.gvacharya.definingarray;

public class RightRotate {

	public static void main(String[] args) {

		int[] rotateElement = { 10, 20, 30, 40, 50 };
		int lastElement = rotateElement[rotateElement.length - 1];
 
		// LOGIC 1
//		for(int i = rotateElement.length - 1; i>0;i--) {
//
//			rotateElement[i] = rotateElement[i-1];
//			
//		}
//		rotateElement[0] = lastElement;
		
		// LOGIC 2
		
		int temp = rotateElement[0];
		int temp1;
		for(int i =0; i<rotateElement.length-1;i++) {
			temp1 = rotateElement[i+1];
			rotateElement[i+1] = temp;
			temp = temp1;
		}
		rotateElement[0] = lastElement;

		for (int i = 0; i < rotateElement.length; i++) {
			System.out.println(rotateElement[i]);
		}
	}
}
