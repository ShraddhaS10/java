package com.gvacharya.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 6, 5, 8, 1, 3, 9, 4 };
		int arraySize = array.length;
		System.out.println("Arrays Before sorting.");
		for (int no : array)
			System.out.print(no + " ");
		System.out.println();

		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize - i - 1; j++)
				if (array[j] > array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			for (int z = 0; z < arraySize; z++)
				System.out.print(array[z] + " ");
			System.out.println();
		}
		System.out.println("Arrays After sorting.");
		for (int no : array)
			System.out.print(no + " ");
	}
}
