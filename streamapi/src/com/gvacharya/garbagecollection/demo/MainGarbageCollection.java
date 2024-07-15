package com.gvacharya.garbagecollection.demo;

public class MainGarbageCollection {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection");
		super.finalize();
	}
	
	public static void main(String[] args) {
		
		
		printStudent();
		
		printStudent();
		System.gc();
		
		System.out.println(new Student());
	}
	
	public static void printStudent() {
		Student student1= new Student();
		Student student2=student1;
		student1=null;
		System.out.println(student1);
	}
}
