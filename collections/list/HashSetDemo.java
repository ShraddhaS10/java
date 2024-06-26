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



//new prg
package com.gv.collections.list;

import java.util.HashSet;
import java.util.Set;

import com.gv.collections.entities.Employee;

public class HashSetDemo {

	public static void main(String[] args) {
//		Set<Integer> intSet = new HashSet<>();
//		intSet.add(4);
//		intSet.add(2);
//		intSet.add(3);
//		intSet.add(2);
////		intSet.add(4);
//		intSet.add(null);
//		intSet.add(1);
//		
//	//	System.out.println(intSet.size());
//		
//		intSet.forEach(System.out::println);
		
		Set<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(new Employee(1,"NImisha"));
		employeeSet.add(new Employee(1,"NimishA"));
		employeeSet.add(new Employee(1,"NImisha"));
		employeeSet.add(new Employee(1,"Nimisha"));
		employeeSet.add(new Employee(1,"NiMisha"));
		employeeSet.add(new Employee(1,"NimiSha"));
		
		
		System.out.println();
		
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(employeeSet);
		
		employeeSet.forEach(System.out::println);
	}
}
