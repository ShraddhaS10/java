package com.gv.multithreading.reflection;

public class Student {

    private int rollno;
    private String name;

    // Constructor with parameters to initialize rollno and name
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Getter method for rollno
    public int getRollno() {
        return rollno;
    }

    // Setter method for rollno
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}
