package com.gv.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

import com.gv.collections.entities.Movies;

public class TreeSetExample {
	
	public static void main(String[] args) {
		NavigableSet<Integer> intTreeSet = new TreeSet<>();
		
		intTreeSet.add(7);
		intTreeSet.add(8);
		intTreeSet.add(5);
		intTreeSet.add(6);
		intTreeSet.add(2);
		intTreeSet.add(3);
		intTreeSet.add(3); // Duplicates are not allowed in a TreeSet
		intTreeSet.add(1);
		
		intTreeSet.forEach(System.out::println);
		
		NavigableSet<Movies> movieSet = new TreeSet<>((e1, e2) -> {
			if (e1.getId() == e2.getId()) {
				return 0;
			} else if (e1.getId() < e2.getId()) {
				return -1;
			} else {
				return 1;
			}
		});
		
		movieSet.add(new Movies(1, "Shawshank Redemption"));
		movieSet.add(new Movies(2, "Schindler's List"));
		movieSet.add(new Movies(3, "Blood Diamond"));
		movieSet.add(new Movies(4, "Inception"));
		
		movieSet.forEach(System.out::println);
		
		// Subset/tailSet/headSet operations
		System.out.println("First Movie: " + movieSet.first());
		System.out.println("Last Movie: " + movieSet.last());
		
		// floor(): return the greatest element less than or equal to the given element
		System.out.println("Floor Movie for (5, \"Blood Diamond\"): " + movieSet.floor(new Movies(5, "Blood Diamond")));
		
		// ceiling(): return the least element greater than or equal to the given element
		System.out.println("Ceiling Movie for (2, \"Blood Diamond\"): " + movieSet.ceiling(new Movies(2, "Blood Diamond")));
		
		// higher(): return the least element strictly greater than the given element
		System.out.println("Higher Movie for (2, \"Blood Diamond\"): " + movieSet.higher(new Movies(2, "Blood Diamond")));
		
	}

}
