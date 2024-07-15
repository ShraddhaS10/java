package com.gvacharya.interfaces.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.gvacharya.interfaces.functionalinterfaces.entities.Student;

public class MainFunctionalInterfaces {

	public static void main(String[] args) {
//		Consumer<Float> consumer = amount -> System.out.println(amount);
		Student student1 = new Student(1,"ABC");
		Student student2 = new Student(2,"BBC");
		Student student3 = new Student(3,"CBC");
		Student student4 = new Student(4,"ACB");
		
		Consumer<Student> printStudent = System.out::println;
		
		Consumer<Float> consumer = System.out::println;
		
		consumer.accept(12.4F);
		consumer.accept(12312.4F);
		consumer.accept(1223432.4F);
		consumer.accept(1233123.4F);
		consumer.accept(1254645654.4F);
		
		printStudent.accept(student1);
		printStudent.accept(student2);
		printStudent.accept(student3);
		printStudent.accept(student4);
		
		Consumer<Integer> oddEven = no->{
			if(no%2==0)
				System.out.println( no + " is Even");
			else
				System.out.println(no + " is Odd");
		};
		
		oddEven.accept(10);
		
		Consumer<Double> randomNumber = System.out::println;
		
		Supplier<Double> supplierRandomNumber = ()-> Math.random();
		
		randomNumber.accept(supplierRandomNumber.get());
		randomNumber.accept(supplierRandomNumber.get());
		randomNumber.accept(supplierRandomNumber.get());
		randomNumber.accept(supplierRandomNumber.get());
		randomNumber.accept(supplierRandomNumber.get());
		
		
		Function<Integer, Float> area = radius -> 3.14F*radius*radius;
		
		System.out.println(area.apply(10));
		
		
		
		Predicate<Integer> checkEven = (number)-> number%2==0;
		
		if(checkEven.test(13))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
