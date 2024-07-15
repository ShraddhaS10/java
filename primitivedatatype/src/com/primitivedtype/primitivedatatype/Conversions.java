package com.primitivedtype.primitivedatatype;

public class Conversions {
	
	public static void main(String[] args) {
		
		//Widening concept example (implicit Conversion)
		byte byteVariable=100;
		short shortVariable = byteVariable;
		
		int intVariable = byteVariable;
		int intVariable1 = shortVariable;
		
		long longVariable= byteVariable;
		long longVariable1 = shortVariable;
		long longVariable2 = intVariable;
		
		float floatVariable = intVariable;
		float floatVariable1 = longVariable;
		
		double doubleVariable = floatVariable;
		
		char charVariable = 'A';
		
		byteVariable = charVariable;
		shortVariable = charVariable;
		intVariable = charVariable;
		
		
		//Narrowing Concept examples (Explicit Conversion)
		
		floatVariable = (float)doubleVariable;
		longVariable = (long) floatVariable;
		intVariable = (int) longVariable;
		shortVariable = (short) intVariable;
		byteVariable = (byte) shortVariable;
		
		
	}
	
}
