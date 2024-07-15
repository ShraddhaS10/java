package com.gvacharya.selectionsort;

public class SelectionSortString {


	public static void main(String[] args) {

		String[] array = { "ebc", "cbc", "bbc", "abc", "dbc" };
		int size = array.length;
		int key;

		System.out.println("Before Sorting: ");
		for(String name:array)
			System.out.println(name + " ");
		
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			key = i;
			for (int j = i+1; j < size; j++) {
				if (array[key].compareTo(array[j])>0)
					key = j;
			}
//
			String temp = array[i];
			array[i] = array[key];
			array[key] = temp;
//			if(key!=i) {
//			array[key] = array[key] + array[i];
//			array[i] = array[key] - array[i];
//			array[key] = array[key] - array[i];
//			}
		}
		
		System.out.println("After Sorting: ");
		for(String name:array)
			System.out.println(name + " ");
	}

}
