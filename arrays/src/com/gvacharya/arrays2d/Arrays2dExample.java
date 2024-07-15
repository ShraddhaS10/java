package com.gvacharya.arrays2d;

import java.util.Arrays;

public class Arrays2dExample {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0] = new int[] {1,2,3};
		matrix[1] = new int[] {4,5,6};
		matrix[2] = new int[] {7,8,9};
//		int temp=1;
//		for(int i=0;i<matrix.length;i++) {
//			
//			for(int j=0;j<matrix[i].length;j++) {
//				matrix[i][j]=temp++;
//			}
//		}
		
		System.out.println(Arrays.deepToString(matrix));
	}
}
