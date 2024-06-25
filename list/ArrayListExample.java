package com.gv.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
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
    }
}

  
