package com.gvahcarya.copyarray;

public class CopyArrays {

	public static void main(String[] args) {
		// Initialization of array
		int[] intArray = new int[] {1,2,3,4,5};
		int[] intArray1= {1,2,3,4,5};
		
		//valid
		int[] intArray2;
		intArray2=new int[] {1,2,3,4,5};
		
		//invalid
//		int[] intArray3;
//		intArray3= {1,2,3,4,5};
		
		
		int[] intArray4 = new int[5];
		//advance for loop
//		for(int number:intArray4)
//			System.out.println(number);
		
		shallowCopy(intArray4);
//		intArray4[0]=10;
//		shallowCopy(intArray4);
		
		for(int i=0;i<intArray4.length;i++)
			System.out.println(intArray4[i]);
		
		deepCopy(intArray2, intArray4);
		
		for(int i=0;i<intArray4.length;i++)
			System.out.println(intArray4[i]);
		
	}
	
	public static void shallowCopy(int[] intArray5) {
		for(int i=0;i<intArray5.length;i++)
			System.out.println(intArray5[i]);
		intArray5[1]=20;
	}
	
	public static void deepCopy(int[] sourceArray, int[] destinationArray) {
		for(int i=0;i<sourceArray.length;i++)
			destinationArray[i]=sourceArray[i];
		
//		for(int number:destinationArray)
//			System.out.println(number);
	}
	
}
