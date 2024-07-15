package com.gvacharya.stringoperation;

import java.util.Arrays;

public class StringOperation {
	
	public static void countVowels(String message) {
		int i;
		int counterA = 0;
		int counterE = 0;
		int counterI = 0;
		int counterO = 0;
		int counterU = 0;
		int counterConsonants = 1;
		char[] nameArray = message.toCharArray();
		
		for(i=0;i<nameArray.length;i++) {
		
			switch(nameArray[i]) {
				
			case 'A' | 'a':
				counterA+=1;
			break;
			
			case 'E' | 'e':
				counterE+=1;
			break;
			
			case 'I' | 'i':
				counterI+=1;
			break;
			
			case 'O' | 'o':
				counterO+=1;
			break;
			
			case 'U' | 'u':
				counterU+=1;
			break;
			
			default:
				counterConsonants++;
			}
		
		}
		System.out.println("A:"+ counterA);
		System.out.println("E:"+ counterE);
		System.out.println("I:"+ counterI);
		System.out.println("O:"+ counterO);
		System.out.println("U:"+ counterU);
		System.out.println("Consonants:"+ counterConsonants);		
	}
	
	public static void reverseString(String message) {
		
		char[] stringArray = message.toCharArray();
		int left = 0;
		int right = (stringArray.length-1);
		
		while(left<right) {	
			
			char temp = stringArray[left];
			stringArray[left] = stringArray[right];
			stringArray[right] = temp;
			left++;
			right--;
			
		}
		System.out.println(Arrays.toString(stringArray));
	}
	
	public static void reverseStringLine(String stringLine) {
		
		String[] stringArray = stringLine.split(" ");
		int left = 0;
		int right = (stringArray.length-1);
		
		while(left<right) {	
			
			String temp = stringArray[left];
			stringArray[left] = stringArray[right];
			stringArray[right] = temp;
			left++;
			right--;
			
		}
		System.out.println(Arrays.toString(stringArray));
	}
	
}
