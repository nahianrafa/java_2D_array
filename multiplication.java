
package com.mycompany.arrayyy;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
      Scanner input  = new Scanner(System.in); 
      
      System.out.print("Enter the number of rows for first matrix:");
      int rows1 = input.nextInt();
      System.out.print("Enter the number of cols for first natrix(rows of second matrix):");
      int cols1 = input.nextInt();
      System.out.print("Enter the number of cols for second matrix:");
      int cols2 = input.nextInt();
      
       int[][] matrix1 = new int[rows1][cols1];
       int[][] matrix2 = new int[cols1][cols2];
       int[][] multiply_matrix = new int[rows1][cols2];
      
      System.out.print("Enter first matrix:");
      for(int i=0; i<rows1; i++){
          for(int j=0; j<cols1; j++){
              matrix1[i][j] = input.nextInt();
          }
          System.out.println();
      }
      System.out.print("Enter second matrix:");
       for(int i=0; i<cols1; i++){
          for(int j=0; j<cols2; j++){
              matrix2[i][j] = input.nextInt();
          }
      }
        for(int i=0; i<rows1; i++){
          for(int j=0; j<cols2; j++){
              for(int k=0;k<cols1; k++){
              multiply_matrix[i][j] = multiply_matrix[i][j] + matrix1[i][k] * matrix2[k][j];
              }
          }
      }
       System.out.print("Multiply of the two matrix: ");
         for(int i=0; i<rows1; i++){
          for(int j=0; j<cols2; j++){
             System.out.println(multiply_matrix[i][j] +" ");
          }
          System.out.println();
      }
    }   
}
