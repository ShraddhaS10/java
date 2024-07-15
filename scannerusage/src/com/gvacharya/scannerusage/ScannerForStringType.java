package com.gvacharya.scannerusage;

import java.util.Scanner;

public class ScannerForStringType {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter char value:");
		
		char varA = scanner.next().charAt(0);
		
		System.out.println("Enter string value:");
		
		String varB = scanner.next();
		
		scanner.nextLine();
		System.out.println("Enter String Line:");
		
		String varC = scanner.nextLine();
		
		
		
		System.out.println(varA);
		System.out.println(varB);
		System.out.println(varC);

		
		scanner.close();
		
		// Type of i/o class to accept input/output
		// I/O with hardware
		// I/O with File
		// I/O with server
	}
}
