package com.gvacharya.definingarray;

import java.util.Arrays;

//Shallow & Deep Copy
public class CopyArray {

	public static void main(String[] args) {

		// Initialization
		int[] intArray = new int[] { 1, 2, 3, 5, 4 };
		int[] intArray1 = { 5, 6, 7, 8, 9 };

		int[] srsArray = { 1, 2, 3 };
		int[] dstArray = new int[5];
		
		int[] scrArray = {1,2,3,4,5,6};
		
		int[] destinationArray = deepCopyArray(scrArray,1,4);
		
//		for(int number:destinationArray)
//			System.out.println(number);
		
		System.out.println(Arrays.toString(destinationArray));
//		deepCopyFunc(srsArray,dstArray);

	}

	public static void shallowCopy(int[] intArray5) {
		for (int i = 0; i < intArray5.length; i++)
			System.out.println(intArray5[i]);
	}

	public static void deepCopy(int[] sourceArray, int[] destinationArray) {
		for (int i = 0; i < sourceArray.length; i++)
			// deep copy
			destinationArray[i] = sourceArray[i];

		for (int number : destinationArray)
			System.out.println(number);
	}

	public static void deepCopyFunc(int[] srsArray, int[] dstArray) {
		for (int i = 0; i < dstArray.length; i++)
			if (i < srsArray.length) {
				dstArray[i] = srsArray[i];
			} else {
				dstArray[i] = 0;
			}

		for (int number : srsArray)
			System.out.println(number);
		for (int number : dstArray)
			System.out.println(number);
	}
	
	public static int[] deepCopyArray(int[] srcArray,int startPosition,int endPosition) {
		
		int[] destination = new int[(endPosition+1) - startPosition];
		int j = 0;
		for(int i = startPosition; i<=endPosition;i++) {
			destination[j++] = srcArray[i];
		}
		
//		for(int number: destination)
//			System.out.println(number);
		
		return destination;
			
	}
}


// shallow copy - only memory address is copied/referenced in another object.