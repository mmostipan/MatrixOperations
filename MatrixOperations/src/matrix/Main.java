package matrix;

import java.util.Arrays;

import matrix.operations.MainMatrixOperations;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		matrix[0][0] = 5;
		matrix[0][1] = 4;
		matrix[0][2] = 3;
		matrix[0][3] = 1;
		matrix[0][4] = 1;
		
		matrix[1][0] = 4;
		matrix[1][1] = 2;
		matrix[1][2] = 1;
		matrix[1][3] = 3;
		matrix[1][4] = 9;
		
		matrix[2][0] = 4;
		matrix[2][1] = 3;
		matrix[2][2] = 2;
		matrix[2][3] = 1;
		matrix[2][4] = 1;
		
		matrix[3][0] = 2;
		matrix[3][1] = 4;
		matrix[3][2] = 3;
		matrix[3][3] = 1;
		matrix[3][4] = 1;
		
		matrix[4][0] = 3;
		matrix[4][1] = 5;
		matrix[4][2] = 1;
		matrix[4][3] = 2;
		matrix[4][4] = 7;
		
		System.out.println("det(A)=" + MainMatrixOperations.det(matrix));
		System.out.println("det(A)=" + Arrays.deepToString(MainMatrixOperations.inv(matrix)));

	}

}
