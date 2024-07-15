package com.gvacharya.manipulation;

public class FindGreatestElement {
	public static void main(String[] args) {
		int[] intArray = {40,30,10,50};
//	System.out.println(Number);
//		int temp=0;
		int temp=intArray[0];
		for(int i=0;i<intArray.length;i++) {
			if(temp<intArray[i]) {
				temp = intArray[i];
			}
		}
		System.out.println("Greatest Number "
				+ "among array element is: " + temp);
	}
}
