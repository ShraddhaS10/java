package com.gvacharya.reversestringprogram;
import java.util.Scanner;

public class ReverseStringMain {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		ReverseString letsReverse = new ReverseString(scanner.nextLine());
		
		letsReverse.reverseString();
		
		scanner.close();
	
	}
	
}
