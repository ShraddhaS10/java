package com.gvacharya.definingarray;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String name = "Kunal";
		char[] stringName = name.toCharArray();
		
		for(int i=0; i<stringName.length; i++) {
			switch(stringName[i]) {
			case 'A' | 'a'->stringName[i]='$';
			case 'E' | 'e'->stringName[i]='#';
			case 'I' | 'i'->stringName[i]='%';
			case 'O' | 'o'->stringName[i]='*';
			case 'U' | 'u'->stringName[i]='@';
		
			}
		}
		
		// char array to string using Constructor;
		String updateName = new String(stringName);
		System.out.println(updateName);
		
		// char array to string using stringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<stringName.length;i++)
			stringBuilder.append(stringName[i]);
		
		String updateName1 = stringBuilder.toString();
		System.out.println(updateName1);
				
	}
}
