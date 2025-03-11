
package com.mycompany.arrayyy;
import java.util.Scanner;


public class Matrix_Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of cols:");
        int cols = input.nextInt();
        
        int[][] matrix1 = new int[rows][cols]; 
        int[][] matrix2 = new int[rows][cols];
        int[][] sum_matrix = new int[rows][cols];
        
        System.out.println("Matrix 1 =");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Elements at matrix1 ["+ i +"]["+ j +"]: ");
                matrix1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix 2 =");
          for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Elements at matrix2  ["+ i +"]["+ j +"]: ");
                matrix2[i][j] = input.nextInt();
            }
            System.out.println();
        }
         
            for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println();
        }
            System.out.println("The sum of two matrix: ");
             for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               System.out.print(sum_matrix[i][j] +" ");
            }
            System.out.println();
        }
           
        
        
    }    
}
