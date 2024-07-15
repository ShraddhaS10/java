package com.gvacharya.datetimeapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 10, 7, 3, 10, 1);

        // Intermediate: map
        List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n)  // Transforms each element to its square
            .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);  

        // Intermediate: filter
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)  // Selects even elements
            .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers); 

        // Intermediate: distinct
        List<Integer> distinctNumbers = numbers.stream()
            .distinct()  // Removes duplicate elements
            .collect(Collectors.toList());
        System.out.println("Distinct Numbers: " + distinctNumbers);  

        // Intermediate: sorted
        List<Integer> sortedNumbers = numbers.stream()
            .sorted()  // Sorts the elements
            .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);  

        // Terminal: toArray
        Integer[] numberArray = numbers.stream()
            .toArray(Integer[]::new);  // Collects elements into an array
        System.out.println("Number Array: " + Arrays.toString(numberArray));  

        // Terminal: collect
        List<Integer> collectedNumbers = numbers.stream()
            .collect(Collectors.toList());  // Gathers elements into a list
        System.out.println("Collected Numbers: " + collectedNumbers); 

        // Terminal: max
        Optional<Integer> maxNumber = numbers.stream()
            .max(Integer::compareTo);  // Finds the maximum element
        maxNumber.ifPresent(max -> System.out.println("Max Number: " + max)); 

        // Terminal: min
        Optional<Integer> minNumber = numbers.stream()
            .min(Integer::compareTo);  // Finds the minimum element
        minNumber.ifPresent(min -> System.out.println("Min Number: " + min));  

        // Terminal: count
        long count = numbers.stream()
            .count();  // Counts the number of elements
        System.out.println("Count: " + count);  // Output: 8

        // Terminal: forEach
        numbers.stream()
            .forEach(n -> System.out.println("Number: " + n));  

        // Terminal: reduce
        Optional<Integer> sum = numbers.stream()
            .reduce(Integer::sum);  // Combines elements to produce a sum
        sum.ifPresent(s -> System.out.println("Sum: " + s));  
    }
}