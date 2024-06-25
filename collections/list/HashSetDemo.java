package com.gv.collections.list;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>();
		intSet.add(4);
		intSet.add(2);
		intSet.add(3);
		intSet.add(2);
	//	intSet.add(4);
		intSet.add(null);
		intSet.add(1);
		
	//	System.out.println(intSet.size());
		
		intSet.forEach(System.out::println);
	}
}
 
