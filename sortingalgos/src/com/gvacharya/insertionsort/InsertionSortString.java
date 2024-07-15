package com.gvacharya.insertionsort;

public class InsertionSortString {

	public static void main(String[] args) {
		String[] stringArray = { "ebc", "cbc", "bbc", "abc", "dbc" };

		int j = 0;
		int key = 0;
		String temp;
//		System.out.println(temp);
		System.out.println("Before sorting: ");
		for (String name : stringArray)
			System.out.println(name + " ");

		for (int i = 1; i < stringArray.length; i++) {
			j = i - 1;
			key = j;
			while (j >= 0 && stringArray[key].compareTo(stringArray[j + 1])>0) {
				temp = stringArray[key];
				stringArray[key] = stringArray[j + 1];
				stringArray[j + 1] = temp;
				j--;
				key--;

			}
		}
		
		System.out.println("After sorting: ");
		for (String name : stringArray)
			System.out.println(name + " ");

	}
}
