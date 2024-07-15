package com.gvacharya.ceilingofanumberproblem;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,5,6,7,8,10,12,14};
		int target = 4;
		
		int result = binarySearch(arr,target);
		System.out.println(result);
	}
	static int binarySearch(int[] arr,int target ) {
		
		int start = arr[0];
		int end = arr.length-1;
		
		
		if(target > arr[end]) {
			return -1;
		}
		
		while(start<=end) {
			int mid = (start + (end-start))/2;
			
			if(target == arr[mid]) {
				return arr[mid];
			}
			
			if(target < arr[mid]) {
				mid = mid - 1;
				
			}else {
				start = mid + 1;
			}
		}
		return arr[start];
	}
}