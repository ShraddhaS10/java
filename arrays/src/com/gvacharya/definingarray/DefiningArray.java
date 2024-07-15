package com.gvacharya.definingarray;

public class DefiningArray {

	public static void main(String[] args) {

// 		valid array syntax definition
		int[] intArray = new int[10];
		int[] intArray1 = new int[10];
		int intArray2[] = new int[10];
		int[] array = {1,2,3,4,5,6}; // initializing array 
		int[] Array3 = new int[] {12,14,1,45,1,5,7};
		
//		invalid array definition syntax
//		[]int intArray3 = new int[10];
//		int[] intArray4 = new [10]int;

		System.out.println(intArray[0]);
		System.out.println(intArray1);
		System.out.println(intArray2);
		System.out.println(array);
		System.out.println(Array3);

		for (int i = 0; i < intArray.length; i++) {

			System.out.println(intArray[i]);
		}
	}
}

// Array are object in java

// advantage
// faster than collection objects
// less memory consumption as no functionality


// disadvantage
// fixed memory declaration beforehand
// only homogeneous data type
// no inbuilt functionality / no underlying data structure
// Array size can not be changed

// usage - to fulfill the need of group of element of similar data type collection