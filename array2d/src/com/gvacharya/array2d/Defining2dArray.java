package com.gvacharya.array2d;

import java.util.Arrays;

public class Defining2dArray {

	public static void main(String[] args) {
		
//		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix = new int[3][3];
		matrix[0] = new int[] {1,2,3};
		matrix[1] = new int[] {4,5,6};
		matrix[2] = new int[] {7,8,9};
		int temp = 1;
		for(int i = 0; i<matrix.length;i++) {
			for(int j=0; j<matrix.length; j++) {
//				System.out.print(matrix[i][j]+" ");
				matrix[i][j] = temp++;
			}
//			System.out.println();
		}
		System.out.println(Arrays.deepToString(matrix));
		
	}
}
 