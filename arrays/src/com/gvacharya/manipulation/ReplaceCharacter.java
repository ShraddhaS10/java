package com.gvacharya.manipulation;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String name="Kunal";
		char[] nameArray = name.toCharArray();
		
		for(int i=0;i<nameArray.length;i++) {
			switch(nameArray[i]) {
				case 'A'->nameArray[i]='!';
				case 'E'->nameArray[i]='@';
				case 'I'->nameArray[i]='#';
				case 'O'->nameArray[i]='$';
				case 'U'->nameArray[i]='%';
				case 'a'->nameArray[i]='!';
				case 'e'->nameArray[i]='@';
				case 'i'->nameArray[i]='#';
				case 'o'->nameArray[i]='$';
				case 'u'->nameArray[i]=64000;
			}
		}
		
		// char array to String using String Constructor;
		String updatedName= new String(nameArray);
		System.out.println(updatedName);
		
		// char array to String using StringBuilder
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<nameArray.length;i++)
			stringBuilder.append(nameArray[i]);
		
		String updatedName1 = stringBuilder.toString();
		System.out.println(updatedName1);
		
	}
}
