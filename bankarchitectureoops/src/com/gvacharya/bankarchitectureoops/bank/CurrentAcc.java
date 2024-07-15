package com.gvacharya.bankarchitectureoops.bank;

public class CurrentAcc extends BankAcc{

	private  static float interest;
	private static int deposit;
	
	public CurrentAcc(String name, long mob, long accNo) {
		super(name, mob, accNo);
	}
	
	
	public CurrentAcc() {
		super();
	}

	public static float getInterest() {
		return interest;
	}


	public static void setInterest(float interest) {
		CurrentAcc.interest = interest;
	}


	public static int getDeposit() {
		return deposit;
	}


	public static void setDeposit(int deposit) {
		CurrentAcc.deposit = deposit;
	}


	@Override
	public void printAccDetails() {
		System.out.println("Name :" + getName());
		System.out.println("Mobile No. :" + getMob());
		System.out.println("Acc No. :" + getAccNo());
		System.out.println("Interest rate :" + interest);
		System.out.println("Balance Amount:" + deposit);
		
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [deposit=" + deposit + "]";
	}
	
	
	
}
