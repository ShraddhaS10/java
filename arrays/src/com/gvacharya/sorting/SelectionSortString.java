package com.gvacharya.sorting;

public class SelectionSortString {

	public static void main(String[] args) {
		String[] array = {"Kalpita", "Aryaman", "Mayank", "Krishna", "Rahul", "Rohan"};
		int size = array.length;
		int key;

		System.out.println("Before Sorting.");
		for (String name : array)
			System.out.print(name + " ");

		System.out.println();

		for (int i = 0; i < size; i++) {
			key = i;
			for (int j = i + 1; j < size; j++)
				if (array[key].compareTo(array[j])>0)
					key = j;
			if (key == i) 
				continue;
			
			String temp=array[i];
			array[i]=array[key];    //			array[key] = array[key] + array[i];
			array[key]=temp;		//			array[i] = array[key] - array[i];
									//			array[key] = array[key] - array[i];
			
		}

		System.out.println("After Sorting.");
		for (String name : array)
			System.out.print(name + " ");

	}
}
