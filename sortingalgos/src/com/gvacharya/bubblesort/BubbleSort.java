package com.gvacharya.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = { 5, 6, 3, 2, 9, 1 };
		int size = intArray.length;

		System.out.println("Before sorting array:");
		for (int n : intArray) 
			System.out.println(n);
		System.out.println();
		
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {

					intArray[j] = intArray[j] + intArray[j + 1];
					intArray[j + 1] = intArray[j] - intArray[j + 1];
					intArray[j] = intArray[j] - intArray[j + 1];
				}
				System.out.println("Inner loop iteration:");
				for(int z:intArray)
					
					System.out.print(z+" ");
					System.out.println();
			}
			
			System.out.println("    ->Outer loop iteration:");
			for(int z:intArray)
				
				System.out.print(z+" ");
				System.out.println();
		}

		System.out.println();
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
	}

}

// In bubble sorting, in every iteration of inner loop from starting to end, 
//   nth element of array will be sorted.

//searching
//big O(1)
//big O(n)
//big O(log n)

//sorting
//big O(n2) - bubble sort
//big O(nlogn)
