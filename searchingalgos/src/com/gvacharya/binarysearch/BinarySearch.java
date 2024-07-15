package com.gvacharya.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array  = {25,44,12,63,47,56,78,41};
		int index = binarySearch(array, 78);
//		System.out.println(index);
		
		if(index>=0) {
			System.out.println("Element found at index "+ index);
		}else {
			System.out.println("Element not found");
		}
		
	}

	public static int binarySearch(int[] array, int target) {
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int left = 0;
		int right = array.length-1;
		int mid = 0;
		
		while(left<=right) {
			mid = (right+left)/2;
			if(target<array[mid]) {
				right = mid-1;
			}else if(target>array[mid]){
				left = mid+1;
			}else if(target == array[mid]) {
				break;
			}	
		}
		if(left>right)
			return -1;
		
		return mid;
		
	}
}