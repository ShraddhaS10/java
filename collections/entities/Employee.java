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
