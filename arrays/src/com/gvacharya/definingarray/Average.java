package com.gvacharya.definingarray;

public class Average {

	public static void main(String[] args) {
		
		int[] arrayElement = {20,10,40,20,70};
		int sum = 0;
		
		for(int i = 0; i<arrayElement.length;i++) 
			sum = sum + arrayElement[i];
		
		System.out.println(sum/arrayElement.length + " is the average of all Array Element");
	}

}
