package com.demo.array;

import java.util.Scanner;

public class MatrixExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r, c;

		System.out.println("Eneter the matrin row : ");

		r = sc.nextInt();

		System.out.println("Eneter the matrix column : ");

		c = sc.nextInt();

		int matrix[][] = new int[r][c];

		// collecting matrix

		for (int row = 0; row < r; row++) {

			System.out.println("For Row " + (row + 1));
			for (int column = 0; column < c; column++) {
				System.out.println("Enter the column " + (column + 1));

				matrix[row][column] = sc.nextInt();
			}
		}

		sc.close();
		
		for (int row = 0; row < r; row++) {

			for (int column = 0; column < c; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

}
