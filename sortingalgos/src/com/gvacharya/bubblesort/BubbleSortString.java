package com.gvacharya.bubblesort;

public class BubbleSortString {
	
	public static void main(String[] args) {

		String[] stringArray = { "ebc", "cbc", "bbc", "abc", "dbc" };
		int size = stringArray.length;

		System.out.println("Before sorting array:");
		for (String name : stringArray) 
			System.out.println(name);
		System.out.println();
		
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (stringArray[j].compareTo(stringArray[j + 1])>0)  {

					String temp = stringArray[i];
					stringArray[i] = stringArray[j+1];
					stringArray[j+1] = temp;
				}
			}

		}

		System.out.println();
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);
	}

}
