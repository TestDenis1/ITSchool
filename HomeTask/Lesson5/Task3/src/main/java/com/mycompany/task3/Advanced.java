package com.mycompany.task3;

public class Advanced {
 
    public static void main(String[] arg){
     
        int mas[][] = new int [4][4];
        
        int a = 0;
        
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < i + 1; j++){
               //mas[i][j] = a;
                // a++;
            }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i + 1; j++)
                System.out.print(" " + mas[i][j]);
            System.out.println();
            }
          
    }
    
    
}
