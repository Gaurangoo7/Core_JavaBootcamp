//Add , Substract , multiply & didvision of matrix 
package com.java.ArrayDemo;

public class MatrixManupulation {
	public static void main(String[] args) {
		int rows = 2, columns = 3;
		// initialize valuses of 2 matrices
		int[][] firstMatrix = { { 2, 3, 4 }, { 7, 8, 3 } };
		int[][] secondMatrix = { { -4, 5, -3 }, { 5, 8, 3 } };

		// Adding Two matrices
		int[][] sum = new int[rows][columns];
		int[][] sub = new int[rows][columns];
		int[][] mul = new int[rows][columns];
		float[][] div = new float[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				sub[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
				mul[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
				div[i][j] = firstMatrix[i][j] / secondMatrix[i][j];

			}
		}

		// Displaying the result
		System.out.println("Sum of two matrices is: ");
		for (int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

		System.out.println("difference of two matrices is: ");
		for (int[] row : sub) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

		System.out.println("Multiplica of two matrices is: ");
		for(int[] row : mul) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

		System.out.println("Division of two matrices is: ");
		for (float[] row : div) {
			for (float column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

	}

}
