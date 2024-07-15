package com.gvacharya.interfacedemo.mainanimal;

import com.gvacharya.interfacedemo.animal.Animal;

public class MainAnimal{

	public static void main(String[] args) {
		
//		Animal dog = new Animal() {
//			
//			@Override
//			public String makenoise(String noise) {
//				return noise;
//			}
//		};
		

		Animal dog = noise -> noise;
		
		Animal cat = new Animal() {
			
			@Override
			public String makenoise(String noise) {
				return noise;
			}
		};
		
		System.out.println(dog.makenoise("bark"));
		System.out.println(cat.makenoise("meow"));
		
	}
}
// for abstract method implementation no need to create, instantiate
// and construct an object but for anonymous class this is must!