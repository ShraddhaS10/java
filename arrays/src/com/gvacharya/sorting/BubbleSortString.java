package com.gvacharya.sorting;

public class BubbleSortString {

	public static void main(String[] args) {
		String[] array = {"Pradnya", "Nimisha", "Harshali", "Anushka", "Harish"};
		int arraySize = array.length;
		System.out.println("Arrays Before sorting.");
		for (String name : array)
			System.out.print(name + " ");
		System.out.println();
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize - i - 1; j++)
				if (array[j].compareTo(array[j + 1])>0 ) {
					String temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			for (int z = 0; z < arraySize; z++)
				System.out.print(array[z] + " ");
			System.out.println();
		}
		System.out.println("Arrays After sorting.");
		for (String name : array)
			System.out.print(name + " ");
	}
}
