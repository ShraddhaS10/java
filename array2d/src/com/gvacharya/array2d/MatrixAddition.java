package com.gvacharya.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];

		System.out.println("Get values  for matrix1");
		fillMatrix(matrix1, scanner);
		System.out.println("Get values  for matrix2");
		fillMatrix(matrix2, scanner);

		System.out.println(Arrays.deepToString(matrix1));
		System.out.println(Arrays.deepToString(matrix2));

		addMatrix(matrix1, matrix2);

	}

	public static void fillMatrix(int[][] matrix, Scanner scanner) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Enter the values for row: " + (i + 1));
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter the values for col: " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}
	}

	public static void addMatrix(int[][] matrix1, int[][] matrix2) {

		int[][] result = new int[3][3];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(result));
	}
}
