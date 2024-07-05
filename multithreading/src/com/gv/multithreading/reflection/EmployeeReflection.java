package com.gv.multithreading.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeReflection {

    public static void main(String[] args) {
        Class<Student> classStudent = Student.class;

        try {
            Student student = classStudent.getDeclaredConstructor().newInstance();
            student.setName("ABC");
            student.setRollno(10);
            System.out.println(student);

            Field[] fields = classStudent.getDeclaredFields();
            System.out.println("\nFields:");
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            Method[] methods = classStudent.getDeclaredMethods();
            System.out.println("\nMethods:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            Method setNameMethod = classStudent.getDeclaredMethod("setName", String.class);
            setNameMethod.invoke(student, "BBC");

            Method setRollnoMethod = classStudent.getDeclaredMethod("setRollno", int.class);
            setRollnoMethod.invoke(student, 20);

            Field rollnoField = classStudent.getDeclaredField("rollno");
            rollnoField.setAccessible(true);
            rollnoField.setInt(student, 230);

            System.out.println("\nUpdated student details:");
            System.out.println(student);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
