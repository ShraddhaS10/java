package com.gvacharya.objectclass;

public class ObjectClassExample {

	public static void main(String[] args) {
		Student student = new Student(1,"ABC");
		Student student1 = new Student(0,"fBC");
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		
		System.out.println(student.equals(student1));
	}
}
