package com.gvahcarya.copyarray;

import java.util.Arrays;

public class DeepCopyExample {

	public static void main(String[] args) {
		int[] srcArray= {1,2,3};
		int[] destArray = new int[5];
		deepCopy(srcArray, destArray);
		
		System.out.println(Arrays.toString(destArray));
	}
	public static void deepCopy(int[] sourceArray, int[] destinationArray) {
		for(int i=0;i<destinationArray.length;i++)
			if(i<sourceArray.length)
				destinationArray[i]=sourceArray[i];
			else
				destinationArray[i]=0;
	}
}
