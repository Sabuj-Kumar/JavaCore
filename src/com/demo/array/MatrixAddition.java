package com.demo.array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r, c;

		System.out.println("Eneter the matrin row : ");

		r = sc.nextInt();

		System.out.println("Eneter the matrix column : ");

		c = sc.nextInt();

		int matrix1[][] = new int[r][c];
		int matrix2[][] = new int[r][c];
		// collecting matrix

		//input matrix one
		System.out.println("Enter Matrix 1");
		
		for (int row = 0; row < r; row++) {

			System.out.println("For Row " + (row + 1));
			for (int column = 0; column < c; column++) {
				System.out.println("Enter the column " + (column + 1));
				matrix1[row][column] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter Matrix 2");
		//input matrix two
		for (int row = 0; row < r; row++) {

			System.out.println("For Row " + (row + 1));
			for (int column = 0; column < c; column++) {
				System.out.println("Enter the column " + (column + 1));
				matrix2[row][column] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("Matrix one : ");
		for (int row = 0; row < r; row++) {

			for (int column = 0; column < c; column++) {
				System.out.print(matrix1[row][column] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matrix two: ");
		
		for (int row = 0; row < r; row++) {

			for (int column = 0; column < c; column++) {
				System.out.print(matrix2[row][column] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matrix Sum : ");
		
		for (int row = 0; row < r; row++) {

			for (int column = 0; column < c; column++) {
				System.out.print(matrix1[row][column] + matrix2[row][column]+ " ");
			}
			System.out.println();
		}
	}

}
