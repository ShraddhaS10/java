package com.gvacharya.interfacedemo;

public interface Validator {
	
	// abstract method declared with proper standard;
	//public abstract boolean isValid();
	
	// still abstract method but not mandatory to use access modifier and keyword abstract.
//	boolean isValid();

	boolean isValid(String property);
	
	boolean isValid(int age);
	
	// both work the same.
}
 
// interfaces are used when there is need to achieve 100% abstraction
// only abstract method can be defined and non-abstract can not be defined methods.
// static, private and default method can be defined in java >1.8 version.
// variable/property can be defined in interface but it has to be
// - public static final datatype property = value;
// constructors are not allowed in interface.
// why private method allowed? because the purpose of private method is to use it within class only.
// why abstract/interface class?
// 1. abstraction
// 2. framework / methodology designing 
// Functional interface - only one abstract method in interface class.
// inbuilt interfaces -
// available in java.util.function package
// 1.Consumer Interface - consumes values passed by user as arguments and doesn't return value.
// 2.Supplier Interface - supplies or returns  value.
// 3.Predicator Interface - returns boolean value only but accepts value of any data type.
// 4.Function Interface - 1 value accepts(consumer type) and 1 value returns(supplier type)
// JAVA 8 Features - lambda expression and functional interface are important features of java 8.
// lambda expression is a implementation of abstract method that does not have return type, method and access modifier.
// Optional interface is mainly used to handle null pointer exception
// Null pointer exception is a event where object has be defined but initialized with null value.

// Stream API
// Operation types - Intermediate(Performs operation and returns String value) and Terminal(produces Output)
// Important Stream API Intermediate functions
// 1.map function (functional interface function) - one dtype to another
// 2.filter (predicate interface function)
// 3.distinct
// 4.sort
// 5.skip
// 6.peek (consumer interface function)
// Important Stream API Terminal function
// 1.max
// 2.min
// 3.foreach
// 4.toArray
// 5.collection
// 6.count
