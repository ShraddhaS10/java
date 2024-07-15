package com.gvacharya.finalkeyword;

public class StringClassExploration {

	// '==' used to check memory address are whether same or not.
	// '.equals() used to check whether values are same or not.

	// in heap area, for string object 'constant pool' area exists to store string
	// object value
	// String city = new String('abc') -> value will be stored in heap area as well
	// as Constant pool
	// String city = 'abc' -> only in Constant pool.

	public static void main(String[] args) {
		String city = "abc";

		String city1 = new String("abc");

		if (city == city1) {
			System.out.println("False");
		}else {
			System.out.println("Fasle");
		}
		
		if (city.equals(city1)) {
			System.out.println("True");
		}
	}

}
