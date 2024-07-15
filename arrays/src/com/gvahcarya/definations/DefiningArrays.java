package com.gvahcarya.definations;

public class DefiningArrays {

	public static void main(String[] args) {
		int[] intArray= new int[10];
		int []intArray1 = new int[10];
		int intArray2[] = new int[10];
		
		System.out.println(intArray);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
		// invalid syntaxes
//		[]int intArray3 = new int[10];
//		int[] intArray4 = new [10]int;
	}
}
