package com.gv.collections.entities;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee() {
        super();
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their IDs
        return Integer.compare(this.id, otherEmployee.id);
    }
}


//new prg

package com.gv.collections.entities;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee() {
        // Default constructor
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters for id and name
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method to represent Employee object as a string
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    // Override equals and hashCode methods for proper comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Implement compareTo method to compare based on ID
    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.id);
    }
}
