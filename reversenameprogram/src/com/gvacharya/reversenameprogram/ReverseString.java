package com.gvacharya.reversenameprogram;
import java.util.Arrays;

public class ReverseString {

	private String name;
	
	public ReverseString() {
		
	}
	
	public ReverseString(String name) {
		this.name = name;
	}
	
	public void reverseString() {
		
		char[] nameArray = name.toCharArray();
		int left = 0;
		int right = (nameArray.length-1);
		
		while(left<right) {	
			
			char temp = nameArray[left];
			nameArray[left] = nameArray[right];
			nameArray[right] = temp;
			left++;
			right--;
			
		}
		System.out.println(Arrays.toString(nameArray));
	}
	
}

