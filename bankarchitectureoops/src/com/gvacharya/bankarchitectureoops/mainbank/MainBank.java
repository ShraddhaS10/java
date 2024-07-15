package com.gvacharya.bankarchitectureoops.mainbank;

import com.gvacharya.bankarchitectureoops.bank.BankAcc;
import com.gvacharya.bankarchitectureoops.bank.CurrentAcc;
import com.gvacharya.bankarchitectureoops.bank.SavingAcc;

public class MainBank {

	public static void main(String[] args) {
		BankAcc acc = new CurrentAcc();
		
		acc.setName("Rohit");
		acc.setMob(932077699);
		acc.setAccNo(245231563);
		CurrentAcc.setInterest(7);
		CurrentAcc.setDeposit(500);
		
		acc.printAccDetails();
		
		BankAcc acc1 = new SavingAcc();
		
		acc1.setName("Vijay");
		acc1.setMob(932077699);
		acc1.setAccNo(245231563);
		SavingAcc.setInterest(7.5);
		SavingAcc.setDeposit(500);
		
		acc1.printAccDetails();
	}
}
