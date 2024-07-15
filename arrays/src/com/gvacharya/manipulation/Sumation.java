package com.gvacharya.manipulation;

public class Sumation {

	public static void main(String[] args) {
		float[] arrayElement = {20,10,40,20,70};
		int sum=0;
		for(int i=0;i<arrayElement.length;i++)
//			sum = sum+(int)arrayElement[i];
			sum += arrayElement[i];
		
		System.out.println("Sumation of "
				+ "Array Element is: " 
				+ (sum/arrayElement.length));
	}
}
