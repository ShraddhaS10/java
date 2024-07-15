package com.gvacharya.mobileapp.presentation;

import java.util.Scanner;

import com.gvacharya.mobileapp.entity.Mobile;

public class MobileUtility {

	private static int top;

	static {
		top = -1;
	}

	private Mobile[] mobiles;

	public void setSize(Scanner scanner) {
		System.out.println("Enter Size of your Stack:");
		mobiles = new Mobile[scanner.nextInt()];
	}

	public void printAllMobiles() {
		for(Mobile mobile:mobiles)
			System.out.println(mobile);
	}

	public int printMenu(Scanner scanner) {
		System.out.println("1:Add Mobile Entry");
		System.out.println("2:Update Mobile Entry");
		System.out.println("3:Delete Mobile Entry");
		System.out.println("4:Show Mobile Entry");
		System.out.println("5:Show All Mobile Entry");
		System.out.println("0:Exit");
		return scanner.nextInt();
	}

	public void addMobileEntry(Scanner scanner) {
//		System.out.println(top);
		if (top < mobiles.length-1) {
			top++;
			mobiles[top] = new Mobile();
			System.out.println("Enter Unique Serial Number:");
			mobiles[top].setSerialNumber(scanner.nextInt());
			System.out.println("Enter Mobile Brand [Samsung|Motorola|Iphone|Sony|Nokia]");
			mobiles[top].setBrand(scanner.next());
			System.out.println("Enter OS [IOS|Android|Rim]");
			mobiles[top].setOs(scanner.next());
		}else
			System.out.println("Stack is Full..");
	}
	
	public void deleteMobileEntry() {
		if(top>=0)
			mobiles[top--]=null;
		else
			System.out.println("Stack is Empty.");
	}
	
	public void updateMobileEntry(Scanner scanner) {
		printAllMobiles();
		System.out.println("Enter Serial Number to Update Mobile Entry:");
		int serialNumber=scanner.nextInt();
		for(int i=0;i<mobiles.length;i++)
			if(mobiles[i].getSerialNumber()==serialNumber) {
				System.out.println("Enter New Brand:");
				mobiles[i].setBrand(scanner.next());
				System.out.println("Enter New OS");
				mobiles[i].setOs(scanner.next());
			}else
				System.out.println("Record Not Found..");
	}
	
	public void printMobileEntry(Scanner scanner) {
		System.out.println("Enter Serial Number to Update Mobile Entry:");
		int serialNumber=scanner.nextInt();
		for(int i=0;i<mobiles.length;i++)
			if(mobiles[i].getSerialNumber()==serialNumber)
				System.out.println(mobiles[i].toString());
			else
				System.out.println("Record Not Found..");
	}
}
