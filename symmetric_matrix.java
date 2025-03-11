package com.mycompany.arrayyy;
import java.util.Scanner;

public class symmetric_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = input.nextInt();
        
        if (row != col) {
            System.out.println("Matrix is not symmetric (not a square matrix).");
            return;
        } 
        
        int[][] matrix = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        boolean isSymmetric = true;
        
       
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;  
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}


