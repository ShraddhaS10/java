package com.gvacharya.interfaces.lambdaexpression.main;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal dog = noise -> ("Bark");
		System.out.println(dog.makeNoise("Bark"));
		
		Animal cat = new Animal() {
			
			@Override
			 public String makeNoise(String voice) {
			 return voice;
			};
		

	}

}
