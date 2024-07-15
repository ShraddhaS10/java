package com.gvacharya.finalkeyword;

public class LateInitializationConcept {

// Late initialization, a concept in java to initialize immutable variable or constant variable later on.

	final float CONSTANT_VALUE;
	
	public LateInitializationConcept() {
		CONSTANT_VALUE = 123;
	}
	
	public LateInitializationConcept(float constant_value) {
		CONSTANT_VALUE = constant_value;
	}
	
	public static void main(String[] args) {
		
		LateInitializationConcept obj = new LateInitializationConcept();
		
		System.out.println(obj.CONSTANT_VALUE);
		
		LateInitializationConcept obj1 = new LateInitializationConcept(456);
		
		System.out.println(obj1.CONSTANT_VALUE);
	}
}
