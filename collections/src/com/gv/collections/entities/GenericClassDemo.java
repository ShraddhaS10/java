package com.gv.collections.entities;
public class GenericClassDemo {

    public static void main(String[] args) {
        add(10, 20);
        add(11, 21);
        add(12, 22);
        add(14, 23);
        add(15, 24);
        
        Generic1 generic1 = new Generic1("ABC");
        Generic2 generic2 = new Generic2(10);
        System.out.println(generic1.getName());
        System.out.println(generic2.getNumber());
        
        Generic<Integer> intGeneric = new Generic<>(1);
        Generic<String> stringGeneric = new Generic<>("ABC");
        Generic<Employee> employeeGeneric = new Generic<>(new Employee(12, "EMP1235"));
        
        System.out.println(intGeneric.getT());
        System.out.println(stringGeneric.getT());
        System.out.println(employeeGeneric.getT());
    }

    public static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }
}
