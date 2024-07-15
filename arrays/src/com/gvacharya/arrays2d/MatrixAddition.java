package com.gvacharya.arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		int []result[] = new int[3][3];
		System.out.println("Get Values for Matrix 1:");
		getUserValues(matrix1,scanner);
		System.out.println("Get Values for Matrix 2:");
		getUserValues(matrix2,scanner);
		
		// Addition of matrices
		for(int i=0;i<result.length;i++)
			for(int j=0;j<result[i].length;j++)
				result[i][j]=matrix1[i][j]+matrix2[i][j];
		
		System.out.println(Arrays.deepToString(matrix1));
		System.out.println(Arrays.deepToString(matrix2));
		System.out.println(Arrays.deepToString(result));
	}
	
	public static void getUserValues(int[][] matrix, Scanner scanner) {
		for(int i=0;i<matrix.length;i++) {
			System.out.println("Enter Values for row: " + (i+1));
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println("for column : " + (j+1));
				matrix[i][j]=scanner.nextInt();
			}
		}
	}
}
