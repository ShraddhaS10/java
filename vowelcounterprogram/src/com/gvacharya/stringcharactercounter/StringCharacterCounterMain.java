package com.gvacharya.stringcharactercounter;
import java.util.Scanner;

public class StringCharacterCounterMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		StringCharacterCounter stringCounter = new StringCharacterCounter(scanner.next());
		
		stringCounter.vowelCounter();
		scanner.close();
	}
}
