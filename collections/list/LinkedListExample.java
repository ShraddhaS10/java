package com.gv.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import com.gv.collections.comparators.EmployeeComparator;
import com.gv.collections.entities.Employee;

public class LinkedListExample {

    public static void main(String[] args) {
        // Example with LinkedList of Integers
        List<Integer> intLinkedList = new LinkedList<>();

        intLinkedList.add(10);
        intLinkedList.add(1, 12); // Adding 12 at index 1

        System.out.println("Integer LinkedList: " + intLinkedList);

        // Attempting to remove element at index 6 (which doesn't exist)
        // intLinkedList.remove(6); // This would throw IndexOutOfBoundsException

        intLinkedList.remove(Integer.valueOf(10)); // Removing element 10 from the list

        // Attempting to access elements at invalid indices
        // intLinkedList.get(6); // This would throw IndexOutOfBoundsException
        // intLinkedList.get(10); // This would throw IndexOutOfBoundsException

        // Checking if the list contains itself (which doesn't make sense)
        // intLinkedList.contains(intLinkedList); // This is incorrect

        boolean isContains = intLinkedList.contains(25);
        System.out.println("Contains 25? " + isContains);

        // Sorting the integer LinkedList
        Collections.sort(intLinkedList);
        System.out.println("Sorted Integer LinkedList: " + intLinkedList);

        System.out.println();

        // Example with LinkedList of Employees
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(2, "EMP31"));
        employeeList.add(new Employee(5, "EMP61"));
        employeeList.add(new Employee(3, "EMP81"));
        employeeList.add(new Employee(1, "EMP51"));

        // Sorting employees by ID using Comparator
        employeeList.sort(Comparator.comparingInt(Employee::getId));
        System.out.println("Sorted Employee List by ID:");
        System.out.println(employeeList);

        // Sorting employees by name using Comparator
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted Employee List by Name:");
        System.out.println(employeeList);

        // Using Stream to print sorted by ID
        System.out.println("Sorted Employee List by ID using Stream:");
        employeeList.stream()
                    .sorted(Comparator.comparingInt(Employee::getId))
                    .forEach(System.out::println);
    }
}
