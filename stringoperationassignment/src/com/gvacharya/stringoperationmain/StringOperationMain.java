package com.gvacharya.stringoperationmain;

import com.gvacharya.stringoperation.StringOperation;

import java.util.Scanner;

public class StringOperationMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
//		System.out.println(StringOperation.reverseString(scanner.next()));
		
		do {
				System.out.println("Select anyone option from below:");
				System.out.println("1. Reverse name");
				System.out.println("2. Count vowels");
				System.out.println("3. Reverse Sentence");
				System.out.println("0. Exit Loop");
				choice = scanner.nextInt();
				switch(choice) {
					
				case 1:
					System.out.println("Enter word to reverse it: ");
					StringOperation.reverseString(scanner.next());
					break;
					
				case 2:
					System.out.println("Enter a text to count vowels in it: ");
					StringOperation.countVowels(scanner.next());
					break;
				
				case 3:
					System.out.println("Enter a sentence to reverse it: ");
					System.out.println(scanner.nextLine());
					StringOperation.reverseStringLine(scanner.nextLine());
					break;
					
				default: 
					System.out.println("Have a good day!");
					break;
				}
//		System.out.println(StringOperation.reverseStringLine(scanner.nextLine()));
		}while(choice != 0);
		scanner.close();
	}
}
