package com.gv.collections.comparators;

import java.util.Comparator;
import com.gv.collections.entities.Employee; // Assuming Employee class is defined in this package

public class EmployeeIDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // Compare by IDs
        return Integer.compare(o1.getId(), o2.getId());
    }
}
