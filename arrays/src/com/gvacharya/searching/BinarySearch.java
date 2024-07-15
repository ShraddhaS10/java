package com.gvacharya.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
//		int[] intArray = {90,70,10,30,50,60};
//		int[] intArray1 = {22,33,11,44,55,88,66};
		int index = binarySearch(66,22,33,11,44,55,88,66);
//		System.out.println(index);
		if(index>=0)
			System.out.println("Element Fount at index : " + index);
		else
			System.out.println("Element not found.");
	}
	
	public static int binarySearch(int element, int... array) {
		Arrays.sort(array);
		
		int left=0;
		int right = array.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(element>array[mid])
				left=mid+1;
			else if(element==array[mid])
//				return mid;
				break;
			else 
				right=mid-1;
		}
		
		if(left>right)
			return -1;
		
		return mid;
	}
}
