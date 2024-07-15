package com.gvacharya.manipulation;

public class RightRotate {

	public static void main(String[] args) {
		
		int[] rotateElement = {10,20,30,40,50,60};
		
		// Before 	Rotating
		for(int i=0;i<rotateElement.length;i++)
			System.out.print(rotateElement[i] + "	");
		
//		for(int i=0;i<rotateElement.length-1;i++) {
//			
////			 	a=a+b
////				b=a-b
////			    a=a-b
//			rotateElement[i]=rotateElement[i]+rotateElement[i+1];
//			rotateElement[i+1]=rotateElement[i]-rotateElement[i+1];
//			rotateElement[i]=rotateElement[i]-rotateElement[i+1];
//			
//		}
		
//		int temp=rotateElement[0];
//		int lastElement=rotateElement[rotateElement.length-1];
//		int temp1;
//		for(int i=0;i<rotateElement.length-1;i++) {
//			temp1=rotateElement[i+1];
//			rotateElement[i+1]=temp;
//			temp=temp1;
//		}
//		rotateElement[0]=lastElement;
		
		int lastElement = rotateElement[rotateElement.length-1];
		for(int i=rotateElement.length-1;i>0;i--)
			rotateElement[i]=rotateElement[i-1];
				
		rotateElement[0]=lastElement;
		
		System.out.println();
		
		for(int i=0;i<rotateElement.length;i++)
			System.out.print(rotateElement[i] + "	");
		
	}
}
