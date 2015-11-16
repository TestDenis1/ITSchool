package com.mycompany._task;

public class Transportation {
    
   public static void main(String[] arg){
       
       int mas[][] = new int[3][2];
       
       int i, j, k = 0;
       
       for(i = 0; i < 3; i++)
           for(j = 0; j < 2; j++){
               mas[i][j] = k;
                k++;
           }  
       for(i = 0; i < 3; i++){
           for(j = 0; j < 2; j++)
               System.out.print(" " + mas[i][j]);
               
           System.out.println();
     }
   System.out.println("Транспартировка матрицы");
       
       for(j = 0; j < 2; j++){
           for(i = 0; i < 3; i++)
               System.out.print(" " + mas[i][j]);
               
           System.out.println();
   }
   }
   
}
