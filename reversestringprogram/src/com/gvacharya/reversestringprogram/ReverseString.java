package com.gvacharya.reversestringprogram;
import java.util.Arrays;

public class ReverseString {

	private String stringLine;
	
	public ReverseString() {
		
	}
	
	public ReverseString(String stringLine) {
		this.stringLine = stringLine;
	}
	
	public void reverseString() {
		
		String[] lineArray = stringLine.split(" ");
		
		int left = 0;
		int right = (lineArray.length - 1);
				
		while (left<right) {
			
			String temp = lineArray[left];
			lineArray[left] = lineArray[right];
			lineArray[right] = temp;
			left++;
			right--;
		}
	
		System.out.println(Arrays.toString(lineArray));
				
	}
}
