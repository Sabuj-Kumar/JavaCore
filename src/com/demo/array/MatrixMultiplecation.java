package com.demo.array;

import java.util.Scanner;

public class MatrixMultiplecation {

	public static void main(String[] args) {

		int r1, c1, r2, c2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first matrix row : ");

		r1 = sc.nextInt();

		System.out.println("Enter the first matrix column : ");

		c1 = sc.nextInt();
		
		System.out.println("Enter the Second matrix row : ");
		
		r2 = sc.nextInt();

		System.out.println("Enter the Second matrix column : ");

		c2 = sc.nextInt();
		
		int matrixA [][] = new int[r1][c1];
		int matrixB [][] = new int[r2][c2];
		int matrixC[][];
		
		if(c1 != r1) {
			
			System.out.print("Matrix Multiplication is not possible."); 
			
			return;
		}
		
		matrixC = new int[r1][c2];
		
		System.out.println();
		System.out.println("Enter Matrix A");
		
		for (int row = 0; row < r1; row++) {

			System.out.println("For Row " + (row + 1));
			for (int column = 0; column < c1; column++) {
				System.out.println("Enter the column " + (column + 1));
				matrixA[row][column] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter Matrix B");
		//input matrix two
		for (int row = 0; row < r2; row++) {

			System.out.println("For Row " + (row + 1));
			for (int column = 0; column < c2; column++) {
				System.out.println("Enter the column " + (column + 1));
				matrixB[row][column] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Multiplication of Two Matrix : ");
		
		for(int row = 0; row < r1; row++) {
			for(int column = 0; column < c2; column++) {
				matrixC[row][column] = 0;
				for(int rowSecond = 0; rowSecond < r2; rowSecond++) {
					matrixC[row][column] += (matrixA[row][rowSecond] * matrixB[rowSecond][column]);
				}
			}
		}
		sc.close();
		System.out.println();
		System.out.println("Result Matrix : ");
		
		for(int row = 0; row < r1; row++) {
			for(int column = 0; column < c2; column++) {
					
				System.out.print(matrixC[row][column] + " ");		
			}
			System.out.println();
		}
	}
}
