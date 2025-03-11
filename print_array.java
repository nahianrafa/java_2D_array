package com.mycompany.arrayyy;

import java.util.Scanner;

public class print_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = input.nextInt();

        int[][] a = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }
    }

}
