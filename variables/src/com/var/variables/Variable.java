package com.var.variables;

public class Variable {
	public static void main(String[] args){
		
		// invalid identifiers
		int 123Variable;
		int &Variable;
		int class;
		int Variable name;
		
		//valid identifiers
		int variable;
		int $variable;
		int _variable;
		
		// naming convention
		int variableName;
		int a;
	}
}

// Primitive data types

////integer
//	byte (8 bit) 2's compliment signed data - positive num : binary as it, negative num : 2's compliment of binary
//	short (16 bit) 2 byte
//	int (32 bit) 4 byte
//	long (64 bit) 8 byte
//	
////floating 
//	float (32 BIT) SINGLE PRECISION FLOATING POINT REPRESENTATION BY IEEE 754 STANDARD RANGE (6-7 DIGITS AFTER DECIMAL POINTS MANTISSA REMAINING EXP)
//	double (64 BIT) DOUBLE PRECISION FLOATING POINT REPRESENTATION BY IEEE 754 STANDARD RANGE (14-15 DIGITS AFTER DECIMAL POINTS FOR MANTISSA "")
//	
//// boolean
//	boolean (1 BIT to say but during utilization not accurately 1 bit or undefined)
//	
//// character
//	char (16 bit) representation for unicode (a character set) character
// only positive number as character can be stored 