package com.gvacharya.interfaces.lambdaexpression.main;

import com.gvacharya.interfaces.lambdaexpression.Animal;

public class MainAnimal {

	public static void main(String[] args) {
		Animal dog= noise -> "Bark";
		
		System.out.println(dog.makeNoise("Bark"));
		
		
		
		Animal cat = new Animal() {
			@Override
			public String makeNoise(String voice) {
				return voice;
			}
		};
		
		
		System.out.println(cat.makeNoise("Meow"));
		
		
		Animal snake=new Animal() {
			
			public String makeNoise(String vc) {
				return vc;
			}
		};
		
		System.out.println(snake.makeNoise("Hisssss"));
	}
}
