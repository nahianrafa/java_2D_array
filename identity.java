package com.mycompany.arrayyy;
import java.util.Scanner;

public class identity {
    public static boolean isIdentityMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if (rows != cols) {
            return false;
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        if (isIdentityMatrix(matrix)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is NOT an identity matrix.");
        }
        
        scanner.close();
    }
}