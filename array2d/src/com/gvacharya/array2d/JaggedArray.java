package com.gvacharya.array2d;

import java.util.Arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
//		//Initialization ways.
//		int[][] jaggedArray = {
//								{},
//								{1},
//								{1,2},
//								{1,2,3}
//										};
		
		int[][] jaggedArray = new int[3][];
		jaggedArray[0] = new int[] {};
		jaggedArray[1] = new int[] {1};
		jaggedArray[2] = new int[] {1,2};
		
		for(int[] row:jaggedArray) {
			for(int col:row)
				System.out.print(col + " ");
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(jaggedArray));
		
	}
}
