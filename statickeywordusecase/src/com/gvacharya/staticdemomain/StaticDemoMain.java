package com.gvacharya.staticdemomain;

import com.gvacharya.staticdemo.StaticDemo;

public class StaticDemoMain {

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.pincode);
		
		StaticDemo sd = new StaticDemo();
		
		System.out.println(sd.pincode1);
	
		StaticDemo sd1 = new StaticDemo();
		System.out.println(sd1.pincode1);
		
		StaticDemo.pincode = 410201;
		
		System.out.println(StaticDemo.pincode);
		
		sd.pincode = 123;
		sd.pincode1 = 456;
		System.out.println(sd.pincode);
		System.out.println(sd1.pincode);
		System.out.println(sd.pincode1);
		System.out.println(sd1.pincode1);
	}
}
