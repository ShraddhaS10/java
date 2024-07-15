package com.gvacharya.scannerusage;
import java.util.Scanner;

public class ScannerForIntegerType {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter integer value:");
		
		byte varA = scanner.nextByte();
		System.out.println("Enter integer value:");
		
		short varB = scanner.nextShort();
		System.out.println("Enter integer value:");
		
		int varC = scanner.nextInt();
		System.out.println("Enter integer value:");
		
		long varD = scanner.nextLong();
		System.out.println("Enter integer value:");
		
		float varE = scanner.nextFloat();
		System.out.println("Enter integer value:");
		
		double varF = scanner.nextDouble();
		System.out.println("Enter integer value:");
		
		System.out.println(varA);
		System.out.println(varB);
		System.out.println(varC);
		System.out.println(varD);
		System.out.println(varE);
		System.out.println(varF);
		
		scanner.close();
	}
}
