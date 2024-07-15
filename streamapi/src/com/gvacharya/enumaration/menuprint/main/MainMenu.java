package com.gvacharya.enumaration.menuprint.main;

import com.gvacharya.enumaration.menuprint.Menu;
import com.gvacharya.enumaration.menuprint.MenuOption;

public class MainMenu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		switch(menu.printMenu()) {
		case 1 -> System.out.println("Add");
		case 2 -> System.out.println("Update");
		case 3 -> System.out.println("Select");
		case 4 -> System.out.println("Select All");
		case 5 -> System.out.println("Delete");
		case 6 -> System.out.println("Sort");
		case 0 -> System.out.println("Exit");
		default -> System.out.println("Invalid Input");
		}
		
	}
}
