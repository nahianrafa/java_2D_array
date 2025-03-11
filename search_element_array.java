
package com.mycompany.arrayyy;
import java.util.Scanner;

public class search_element_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = input.nextInt();
        System.out.print("Enter the number of cols:");
        int col = input.nextInt();
        
        int[][] array = new int[row][col];
        
        System.out.println("Enter the element sof the array: ");
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = input.nextInt();
            }
        }
        
        System.out.print("Enter the number to search:");
        int search_num = input.nextInt();
        
        boolean found = false;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(array[i][j] == search_num ){
                System.out.print("Number found at position ("+ i +" , "+ j +")");
                found = true;
                }
            }
        }
        if(!found){
            System.out.println("Number not found in the array");
        }
    }
    
}
