package com.gvacharya.classstructure.main;
import com.gvacharya.classstructure.ClassStructure;

public class MainClassStructure {
		
	public static void main(String[] args) {
	
		//create instance of the class
		ClassStructure obj = new ClassStructure();
		obj.setPrice(50);
		obj.setBarcode(1024520);
		obj.setBrandName("Milton");
		
		System.out.println(obj.getPrice());
		System.out.println(obj.getBarcode());
		System.out.println(obj.getBrandName());
	}
}
