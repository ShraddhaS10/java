package com.gvacharya.interfacedemo.assignment;

public class MainSavingAcc {
	
	 static float balance;

	    public static void main(String[] args) {

	        balance = 10000.00F;

	        SavingAcc withdraw = (amount) -> {
	            balance -= amount;
	            return balance;
	        };


	        SavingAcc deposit = (amount) -> {
	            balance += amount;
	            return balance;
	        };

	        withdraw.transaction(1000.00F);
	        System.out.println(balance);

	        deposit.transaction(2000F);
	        System.out.println(balance);
	    }
}
