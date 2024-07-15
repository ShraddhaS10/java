package com.gv.acharya.stringassignment;

import java.util.Arrays;

public class StringDeepCopy {
	
	public static void main(String[] args) {
		String[] sourceArray = new String[] {"Sagar", "Kunal", "Jatin", "Rohit", "Rohan"};
		
		String[] destination = DeepCopy(sourceArray,'R');
		
		System.out.println(Arrays.toString(destination));
	}
	
	public static String[] DeepCopy(String[] sourceArray,char Target) {
		
		
		int count = 0; 
		
		 
		for(int i=0; i<sourceArray.length; i++) 
			if(sourceArray[i].charAt(0) == Target) {
				count=count+1;
			}
		
		
		String[] destination = new String[count];
		int j = 0;
		for(int i=0; i<sourceArray.length;i++) {
			if(sourceArray[i].charAt(0) == Target) {
				destination[j]= sourceArray[i];
				j++;
			}
		}
		
		return destination;
	}
}
