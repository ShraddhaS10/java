package com.gvacharya.bankarchitectureoops.bank;

public class SavingAcc extends BankAcc{

	private  static double interest;
	private static int deposit;
	
	public SavingAcc() {
		super();
	}

	public SavingAcc(String name, long mob, long accNo) {
		super(name, mob, accNo);
		// TODO Auto-generated constructor stub
	}

	public static double getInterest() {
		return interest;
	}

	public static void setInterest(double interest) {
		SavingAcc.interest = interest;
	}

	public static int getDeposit() {
		return deposit;
	}

	public static void setDeposit(int deposit) {
		SavingAcc.deposit = deposit;
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
		return "SavingAcc [getName()=" + getName() + ", getMob()=" + getMob() + ", getAccNo()=" + getAccNo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
