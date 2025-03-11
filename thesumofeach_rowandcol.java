
package com.mycompany.arrayyy;
import java.util.Scanner;
public class thesumofeach_rowandcol {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the num of rows: ");
       int rows = input.nextInt();
        System.out.print("Enter the num of rows: ");
       int cols = input.nextInt();
       
        int[][] array = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Elements at ["+ i +"]["+ j +"]:");
                array[i][j] = input.nextInt();       
            }
             System.out.println();
        }
        System.out.println("Array :");
          for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               System.out.print(" " +array[i][j]);     
            }
            System.out.println();
        }        
        // Calculate and print sum of each row
        System.out.println("\n Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
        
        // Calculate and print sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}

