package com.gvacharya.reversenameprogram;
import java.util.Scanner;

public class ReverseStringMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		
		ReverseString letsReverse = new ReverseString(scanner.next());
		
		letsReverse.reverseString();
		
		scanner.close();
	}
}
