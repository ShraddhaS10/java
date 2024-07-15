package com.gvacharya.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.gvacharya.streamapi.entitiies.Student;

public class App {

	public static void main(String[] args) {
		int[] intArray = {3,2,4,1,6,7,4,1,5};
		
		IntStream intStream=Arrays.stream(intArray);
		
		OptionalInt max=(intStream
			.filter(no->no%2==0)
				.map(no->no+1)
					.max());
						//.forEach(no->System.out.println(no));
		
		if(!max.isEmpty())
		System.out.println();
		intStream.close();
		
		Student[] studentArray = new Student[5];
		
		studentArray[0] = new Student(1,"Megha", 20);
		studentArray[1] = new Student(2,"Ankita", 21);
		studentArray[2] = new Student(3,"Laxmi", 23);
		studentArray[3] = new Student(4,"Vishal", 22);
		studentArray[4] = new Student(5,"Rahul", 21);
		
		
		Stream<Student> studentStream=Arrays.stream(studentArray);
		
		studentStream.map(e->e.getName())
			.filter(name->name.charAt(1)=='a')
			.forEach(name->System.out.println(name));
		
		studentStream.close();
		
		Stream<Student> studentStream1=Arrays.stream(studentArray);
		
		Optional<Integer> max1= studentStream1
			.map(Student::getAge)
				.distinct()
					.sorted(Comparator.reverseOrder())
						.filter(e->e>20)
						.min(Comparable::compareTo);
//							.skip(2)
//								.forEach(System.out::println);
//							.count();
		if(!max1.isEmpty())
			System.out.println(max1.get());
		
//		System.out.println(count);
		
		studentStream1.close();
		
		
		
		Stream<Student> studentStream2=Arrays.stream(studentArray);
		
		studentStream2
			.map(Student::getName)
			.peek(System.out::println)
			 .filter(str->str.charAt(1)=='a')
			 .peek(System.out::print);
//			 .toArray(String[]::new);
//			 .collect(Collector.asList());
		
		System.out.println();
		
//		for(String name:nameArray)
//			System.out.println(name);
		
	}
}
