package com.gvacharya.definingarray;

public class ArrayElementMultiplication {

	public static void main(String[] args) {
		
		int[] arrayElement = {20,10,40,20,70};
		int mul = 1;
		
		for(int i = 0; i<arrayElement.length;i++) 
			mul = mul * arrayElement[i];
		
		System.out.println(mul + " is the multiplication of all Array Element");
	}

}
