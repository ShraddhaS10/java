package com.gv.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Integer ArrayList
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        System.out.println("Integer ArrayList: " + intArrayList);

        // String ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("ABC");
        stringList.add("BBC");
        stringList.add("CBC");
        stringList.add("DBC");
        stringList.add("EBC");
        System.out.println("String ArrayList: " + stringList);

        // Using for loop to iterate through stringList
        System.out.println("Iterating stringList using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Using for-each loop to iterate through intArrayList
        System.out.println("Iterating intArrayList using for-each loop:");
        for (Integer number : intArrayList) {
            System.out.println(number);
        }

        // forEach method with lambda expression to print elements of stringList
        System.out.println("Using forEach method with lambda:");
        stringList.forEach(e -> System.out.println(e));

        // Using Stream API to print elements of stringList
        System.out.println("Using Stream API:");
        stringList.stream().forEach(System.out::println);

        // Using Stream API to print binary representation of numbers in intArrayList
        System.out.println("Binary representation of numbers in intArrayList:");
        intArrayList.stream()
                   .map(Integer::toBinaryString)
                   .forEach(System.out::println);

        // Using Iterator to iterate through intArrayList
        System.out.println("Iterating intArrayList using Iterator:");
        Iterator<Integer> intIterator = intArrayList.iterator();
        while (intIterator.hasNext()) {
            Integer number = intIterator.next();
            System.out.println(Integer.toBinaryString(number));
        }
    }
}
