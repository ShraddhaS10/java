package com.gv.collections.entities;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // Create a LinkedHashSet of Employees
        Set<Employee> empLinkedHashSet = new LinkedHashSet<>();

        // Adding employees to the set
        empLinkedHashSet.add(new Employee(1, "Jateen"));
        empLinkedHashSet.add(new Employee(2, "Rohit"));
        empLinkedHashSet.add(new Employee(3, "Kunal"));
        empLinkedHashSet.add(null); // Allows null elements
        empLinkedHashSet.add(new Employee(4, "Taha"));
        empLinkedHashSet.add(new Employee(5, "Aniket"));
        empLinkedHashSet.add(new Employee(6, "Shon"));

        // Printing all employees in the set using forEach and method reference
        empLinkedHashSet.forEach(System.out::println);

        // Removing an employee from the set
        empLinkedHashSet.remove(new Employee(6, "Shon"));
        System.out.println("After removing (6, Shon): " + empLinkedHashSet);

        // Checking if the set is empty
        System.out.println("Is set empty? " + empLinkedHashSet.isEmpty());

        // Checking if the set contains a specific employee
        System.out.println("Contains (5, Aniket)? " + empLinkedHashSet.contains(new Employee(5, "Aniket")));

        // Converting the set to an array
        Employee[] empArray = empLinkedHashSet.toArray(new Employee[empLinkedHashSet.size()]);
        System.out.println("Array representation: " + Arrays.toString(empArray));

        // Printing the set again
        System.out.println("Current set: " + empLinkedHashSet);

        // Getting the size of the set
        System.out.println("Size of set: " + empLinkedHashSet.size());
    }
}
