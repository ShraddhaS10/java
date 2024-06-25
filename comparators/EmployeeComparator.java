package com.gv.collections.comparators;

import java.util.Comparator;
import com.gv.collections.entities.Employee; // Assuming Employee class is defined in this package

public class EmployeeComparator implements Comparator<Employee> {
    
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare logic based on ID
        int idComparison = Integer.compare(emp1.getId(), emp2.getId());
        
        if (idComparison != 0) {
            return idComparison; // Return comparison result if IDs are different
        } else {
            // If IDs are the same, compare by name
            return emp1.getName().compareTo(emp2.getName());
        }
    }
}
