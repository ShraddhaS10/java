package com.gvahcarya.copyarray;

import java.util.Arrays;

public class CopyArrayInRange {
	public static void main(String[] args) {
		int[] srcArray = {1,2,3,4,5,6,9,10,75,35,47};
		int[] destArray = copyArrayInRange(srcArray,1,6);
		
		System.out.println(Arrays.toString(destArray));
	}
	
	public static int[] copyArrayInRange(int[] sourceArray,
						int startPosition, int endPosition) {
		
		int[] destinationArray = 
				new int[(endPosition+1)-startPosition];
		
//		int j=0;
		for(int i=startPosition,j=0;i<=endPosition;i++, j++)
			destinationArray[j]=sourceArray[i];
		
		return destinationArray;
	}
}
