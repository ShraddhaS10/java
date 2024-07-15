package com.gvacharya.mobileapp;

import java.util.Scanner;

import com.gvacharya.mobileapp.presentation.MobileUtility;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MobileUtility utility = 
				new MobileUtility();
		utility.setSize(scanner);
		
		int choice=0;
		do{
			System.out.println();
			choice = utility.printMenu(scanner);
			switch(choice) {
				case 1->utility.addMobileEntry(scanner);
				case 2->utility.updateMobileEntry(scanner);
				case 3->utility.deleteMobileEntry();
				case 4->utility.printMobileEntry(scanner);
				case 5->utility.printAllMobiles();
				case 0->System.out.println("Bye..");
				default->System.out.println("Invlid Input");
			}
		}while(choice!=0);
				
	}
}
