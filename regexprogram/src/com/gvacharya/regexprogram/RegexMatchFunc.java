package com.gvacharya.regexprogram;
import java.util.Scanner;

public class RegexMatchFunc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter valid name: ");
		
		String name = scanner.next();
		
		if (name.matches("[A-Z][a-z]{1,9}")) {
			System.out.println("Valid name");
		}else {
			System.out.println("Invalid name");
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Enter valid mobile Number: ");
		String mobileNumber = scanner.next();
		
		if (mobileNumber.matches("[6-9][0-9]{9}")) {
			System.out.println("valid Number");
		}else {
			System.out.println("Invalid Number");
		}
		
		scanner.close();
		
	}
	
}
