
package com.mycompany.arrayyy;
import java.util.Scanner;

public class max_min {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       System.out.print("Enter the number of rows: ");
       int row = input.nextInt();
       System.out.print("Enter the number of cols: ");
       int col = input.nextInt();
       
       int[][] a= new int[row][col];
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print("Elements at ["+i+"] ["+j+"]: ");
               a[i][j] = input.nextInt();
           }
       }
       
       int largest = a[0][0];
       int smallest = a[0][0];
       
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
              if(largest<a[i][j]){
                  largest = a[i][j];
              }
                if(smallest>a[i][j]){
                  smallest = a[i][j];
              }
           }
       }
       System.out.print("The largest num= " +largest);
       System.out.print("\n The smallest num= " +smallest);
    }
    
}
