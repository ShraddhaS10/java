package com.gv.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetExamples {

    public static void main(String[] args) {
        // HashSet initialization
        Set<Integer> intSet = new HashSet<>();
        intSet.add(4);
        intSet.add(3);
        intSet.add(1);
        intSet.add(6);
        intSet.add(2);
        intSet.add(7);
        intSet.add(7); // Duplicates are not allowed in a set
        intSet.add(6); // Duplicates are not allowed in a set

        // Correcting subset operation using TreeSet
        SortedSet<Integer> treeSet = new TreeSet<>(intSet);
        SortedSet<Integer> subSet = treeSet.subSet(3, 8);
        System.out.println("Original intSet: " + intSet);
        System.out.println("Subset from 3 to 8: " + subSet);

        // Removing from subSet affects original intSet
        subSet.remove(4);
        System.out.println("After removing 4 from subset:");
        System.out.println("Original intSet: " + intSet);
        System.out.println("Subset: " + subSet);

        // TailSet and HeadSet operations on TreeSet
        SortedSet<Integer> tailSet = treeSet.tailSet(5);
        SortedSet<Integer> headSet = treeSet.headSet(3);

        System.out.println("TreeSet: " + treeSet);
        System.out.println("TailSet from 5: " + tailSet);
        System.out.println("HeadSet before 3: " + headSet);

        // Unmodifiable set example
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(intSet);
        System.out.println("Unmodifiable set: " + unmodifiableSet);

        // Trying to modify an unmodifiable set will throw UnsupportedOperationException
        // Uncommenting below lines would throw UnsupportedOperationException
        /*
        unmodifiableSet.add(10);
        unmodifiableSet.remove(4);
        */

        // Iterator example to remove elements from a modifiable set
        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 6) {
                iterator.remove(); // Removing element 6 from the set
            }
        }
        System.out.println("After removing 6 using iterator: " + intSet);

        // Checked set example
        Set<Integer> checkedSet = Collections.checkedSet(new HashSet<>(), Integer.class);
        checkedSet.add(10);
        // checkedSet.add("String"); // This would throw ClassCastException at runtime
        System.out.println("Checked set: " + checkedSet);
    }
}
