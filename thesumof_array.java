
package com.mycompany.arrayyy;
import java.util.Scanner;

public class thesumof_array {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows:");
        int row= input.nextInt();
        System.out.print("Enter the number of rows:");
        int col= input.nextInt();
        
        int[][] array = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Elements at ["+ i +"]["+ j +"]:");
                array[i][j] = input.nextInt();
            }
        }
        int sum=0;
           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum = sum + array[i][j];
            }
        }
        
     System.out.print("The sum of all elements in the 2D array is:"+sum);
        
    }
}
