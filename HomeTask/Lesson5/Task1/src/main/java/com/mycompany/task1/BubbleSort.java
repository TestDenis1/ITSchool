package com.mycompany.task1;

public class BubbleSort {
    
    public static void main(String[] arg){
    
       int mas [] = {10,3,11,16,14,2,55,100,-1,4};
    
      for(int i = 0; i < 10; i++){
       
       }
       
      for(int i = 0; i < 10; i++){
          for(int j = 0; j < 10-i-1; j++){
              if(mas[j] > mas[j+1]){
                  int tmp = mas[j];
                  mas[j] = mas[j+1];
                  mas[j+1] = tmp;
              }
          }
      }
      for(int i = 0; i < 10; i++)
          System.out.println(mas[i]+" ");
      
       
       
  }
    
}