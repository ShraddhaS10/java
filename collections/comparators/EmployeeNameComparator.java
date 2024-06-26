package com.gv.collections.comparators;

import java.util.Comparator;
import com.gv.collections.entities.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

