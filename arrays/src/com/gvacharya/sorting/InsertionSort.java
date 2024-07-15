package com.gvacharya.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {8,5,4,3,1,2};
		
		System.out.println("Before Sorting.");
		for(int number:array)
			System.out.print(number + " ");
		int j=0;
		int key=0;
		int temp=0;
		for(int i=1;i<array.length;i++) {
			j=i-1;
			key=j;
			while(j>=0 && array[key]>array[j+1]) {
				temp=array[key];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;
				key--;
			}
		}
			
		System.out.println();
		
		System.out.println("After Sorting.");
		for(int number:array)
			System.out.print(number + " ");
	}
}
