package com.gvacharya.garbagecollection.demo.mainstudent;

import com.gvacharya.garbagecollection.demo.Student;

public class MainGarbageCollection {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection");
		super.finalize();
	}
	public static void main(String[] args) {
		printStudent();
		System.out.println();
		System.gc();
		
		//Scenario 3 for candidate to become eligible for GC
		//Anonymous object
		System.out.println(new Student());
	}
	
	public static void printStudent() {
		//scenario 1 -scope decreasing
		Student student = new Student();		
		System.out.println(student);
		
		//Scenario 2 - assigning null 
//		student = null;
		
		//scenario 4 - changing reference variable name
		Student student2 = student;
	}
}
