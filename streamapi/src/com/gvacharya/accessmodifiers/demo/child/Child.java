package com.gvacharya.accessmodifiers.demo.child;

import com.gvacharya.accessmodifiers.demo.Parent;

public class Child extends Parent{
	

	public void childShow() {
		Child child = new Child();
		
		child.number=10;
		child.parentShow();
	}
	
}
