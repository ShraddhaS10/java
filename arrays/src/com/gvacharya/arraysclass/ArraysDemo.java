package com.gvacharya.arraysclass;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		
		int[] intArray = {2,3,4,5,1,6,7,9};
		int[] intArray1 = {2,3,4,5,1,6,7,9};
		
		int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
//		Arrays.sort(intArray);
		
//		Arrays.sort(matrix1);
//		Arrays.sort(matrix2);
		
		String array2dToString = Arrays.deepToString(matrix1);
		System.out.println(array2dToString);
		
		if(Arrays.deepEquals(matrix1, matrix2))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
		
		
		String reversedArrayString = Arrays.toString(intArray);
		
		
		
		System.out.println(reversedArrayString);
		
		
		if(Arrays.equals(intArray, intArray1)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		int index=Arrays.binarySearch(intArray, 9);
		if(index<0)
			System.out.println("Element Not Found.");
		else
			System.out.println("Element Found at: " + index);
	}

}
