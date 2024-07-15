package com.gvacharya.bankarchitectureoops.bank;

public abstract class BankAcc {

	private String name;
	private long mob;
	private long accNo;
	
	
	public BankAcc(String name, long mob, long accNo) {
		super();
		this.name = name;
		this.mob = mob;
		this.accNo = accNo;
	}

	public BankAcc() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public abstract void printAccDetails();
	
	@Override
	public String toString() {
		return "BankAcc [name=" + name + ", mob=" + mob + ", accNo=" + accNo + "]";
	}
	
	
}
