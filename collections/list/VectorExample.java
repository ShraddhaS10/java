package com.gv.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.gv.collections.entities.Employee;

public class VectorExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();

        List<Employee> employeeList1 = Arrays.asList(
                new Employee(2, "EMP2"),
                new Employee(3, "EMP3"),
                new Employee(4, "EMP4")
        );

        employeeList.add(new Employee(8, "ABC"));
        employeeList.add(new Employee(9, "BBC"));

        // Printing initial lists
        System.out.println("Initial employeeList:");
        employeeList.forEach(System.out::println);

        System.out.println("Initial employeeList1:");
        employeeList1.forEach(System.out::println);

        // Example of retainAll method
        employeeList.retainAll(employeeList1);

        // Printing retained elements in employeeList after retainAll operation
        System.out.println("EmployeeList after retainAll:");
        employeeList.forEach(System.out::println);
    }
}