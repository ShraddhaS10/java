package com.gvacharya.sorting;

public class InsertionSortString {

	public static void main(String[] args) {
		String[] stringArray= {"Vaishnavi", "Rahul", "Vishal", "Prachi", "Laxmi"};
		
		
//		System.out.println(temp);
		System.out.println("Before Sorting.");
		for(String name:stringArray)
			System.out.print(name + " ");
		
		int j=0;
		int key=0;
		String temp;
		for(int i=1;i<stringArray.length;i++) {
			j=i-1;
			key=j;
			while(j>=0 && stringArray[key].compareTo(stringArray[j+1])>0) {
				temp=stringArray[key];
				stringArray[j]=stringArray[j+1];
				stringArray[j+1]=temp;
				j--;
				key--;
			}
		}
		
		// String array sorting using Bubble sort 
		// and Selection Sort
		
		System.out.println();
		
		System.out.println("Before Sorting.");
		for(String name:stringArray)
			System.out.print(name + " ");
	}
}
