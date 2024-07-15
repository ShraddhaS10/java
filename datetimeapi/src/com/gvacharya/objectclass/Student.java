package com.gvacharya.objectclass;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return rollNo*10 +name.hashCode(); 
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual=true;
		Student temp=(Student)obj;
		if((temp.rollNo!=this.rollNo) || (!temp.name.equals(this.name)))
			isEqual=false;
		
		return isEqual;
	}

}
