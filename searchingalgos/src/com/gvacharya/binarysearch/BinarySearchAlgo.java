package com.gvacharya.binarysearch;

import java.util.Arrays;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] array = {25,44,12,63,85,47,56,78,41};
		int index = binarySearch(78,array);
//		System.out.println(index);
		
		if(index>=0) {
			System.out.println("Element found at index "+ index);
		}else {
			System.out.println("Element not found");
		}
	}
	// if sending var args as argument remember to provide it is last arguement
	public static int binarySearch(int target,int... array) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length -1;
		int mid = 0;
		
		while(left<=right) {
			mid = (left+right)/2;
			
			if(target<array[mid]) 
				right = mid-1;
			else if(target>array[mid]) 
				left = mid+1;
			else
				break;
		}
		if(left>right)
			return -1;
		
		return mid;
	}
}
