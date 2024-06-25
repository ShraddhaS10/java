package com.gv.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        
        List<Integer> intList1 = Collections.emptyList();
        
        List<Integer> intList = new ArrayList<>(5);
        
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        
        Collections.reverse(intList);
        System.out.println(intList);
        
        Collections.shuffle(intList);
        System.out.println(intList);
        
        Collections.rotate(intList, 1);
        System.out.println(intList);
        
        int index = Collections.binarySearch(intList, 2);
        System.out.println("Index of 2: " + index);
        
        // Finding max and min values
        Integer max = Collections.max(intList);
        System.out.println("Max value: " + max);
        
        Integer min = Collections.min(intList);
        System.out.println("Min value: " + min);
    }
}
