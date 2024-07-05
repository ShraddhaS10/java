package com.gv.generic.classes;
import com.gv.generic.classes.ObjectBox;
import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		ObjectBox<Integer> intBox = new ObjectBox<>();
		intBox.setList(intlist);
		
		boolean result=intBox.addElement(10);
		boolean result1=intBox.addElement(20);
		boolean result2=intBox.addElement(30);
		
		System.out.println(result);
		
		System.out.println(intList);
					
		List<String> stringList = new ArrayList<>();
		ObjectBox.setList(stringList);
		stringBox.addElement("ABC");
		stringBox.addElement("BBC");
		stringBox.addElement("CBC");
		stringBox.addElement("DBC");

		System.out.println(stringList);
		
//		List<?> result1IntList = intBox.getList();
//		List<?> result1StringList = intBox.getList();
		
	//	result1IntList = intBox.getList();
//		
//		result1IntList.forEach(System.out::println);
//		result1StringList.forEach(System.out::println);
		
//		intBox.addElement("ABC");
		
		intBox.zForEach();
		stringBox.zForEach();
		
		zSort(intBox.getList());
		zSort(stringBox.getList());
		
		studentBox.addElement(new Student(3, "ABC"));
		studentBox.addElement(new Student(2, "CBC"));
		studentBox.addElement(new Student(1, "BBC"));
		studentBox.addElement(new Student(4, "EBC"));
		
		studentBox.zForEach();
		
		zSort(studentBox);
	}
		public static <Z  extends Comparable<Z>> void zSort (ObjectBox<Z> zlist);
		Collections.sort(zlist.getList());
		System.out.println(zlist.getList());
		
		
	}
}
