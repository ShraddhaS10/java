package com.gv.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import com.gv.collections.entities.Employee;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Employee> employeeStack = new Stack<>();

        // Pushing employees onto the stack
        employeeStack.push(new Employee(1, "ABC"));
        employeeStack.push(new Employee(2, "DEF"));
        employeeStack.push(new Employee(3, "GHI"));
        employeeStack.push(new Employee(4, "JKL"));

        // Peek at the top of the stack (without removing)
        Employee peekedEmployee = employeeStack.peek();
        System.out.println("Top of the stack (peek): " + peekedEmployee);

        // Pop an employee from the stack
        Employee poppedEmployee = employeeStack.pop();
        System.out.println("Popped employee: " + poppedEmployee);

        // Check the size of the stack
        System.out.println("Stack size after popping: " + employeeStack.size());

        // Transfer elements from stack to a list
        List<Employee> empList = new ArrayList<>();
        while (!employeeStack.empty()) {
            empList.add(employeeStack.pop());
        }

        // Print the transferred list of employees
        System.out.println("Employees transferred to list:");
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
