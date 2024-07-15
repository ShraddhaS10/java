package com.gvacharya.printcharat;

public class PrintCharacterOnly {
	
	public static void main(String[] args) {
		
		int i;
		String message = "H123456789IJEKL";
		
		for(i=0;i<message.length();i++) {
//			
//			if(message.charAt(i).matches("[0-9]")) {
//				continue;
//			}else {
//				System.out.println(message.charAt(i));
//			}
			
			if(message.charAt(i)>= '0' && message.charAt(i) <= '9') {
				continue;
			}else {
				System.out.println(message.charAt(i));
			}
		}
	}
}

// charAt is used to read character at x position.
// static variables
// static methods
// static {  } (block)
// main class cannot be static but within class another class, subclass can be static.