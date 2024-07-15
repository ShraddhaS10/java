package com.primitivedtype.primitivedatatype;

public class PrimitiveDataType {
	public static void main(String[] args) {
		byte byteVariable = 127; //128;
		System.out.println(byteVariable);
		
		float floatVariable = 123.456F;
		float floatVariable1 = 1.23456e3F;
		System.out.println(floatVariable);
		System.out.println(floatVariable1);
		
		boolean booleanVariable =true; //false;
		System.out.println(booleanVariable);
		
		char charVariable=64000; //-64000 no representation for negative num;
		System.out.println(charVariable);
		char charVariable1='A'; //"A";
		System.out.println(charVariable1);
	}
}
