package com.gvacharya.definingarray;

public class FindSmallestElement {

	public static void main(String[] args) {
		
		int[] intArray = {20,52,40,15};
		int temp = intArray[0];
		
		for(int i = 0; i<intArray.length;i++) {
			if(temp>intArray[i]) {
				temp = intArray[i];
			}
		}
		
		System.out.println(temp + " is smallest among array");
	}
}
