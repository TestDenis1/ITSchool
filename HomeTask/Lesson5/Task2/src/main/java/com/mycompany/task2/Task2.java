package com.mycompany.task2;

public class Task2 {
    
    public static void main(String[] arg){
    
            int[] mas = new int[10];
            int[] masA = new int[15];

                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int)Math.round(Math.random()*100);
                }

                 for (int i = 0; i < mas.length; i++) {
                 masA[i] = mas[i];
                 }

                 for (int i = mas.length;i < masA.length; i++) {
                 masA[i] = -1;
                 }

                 for (int i = 0; i < masA.length; i++) 
                 System.out.print(masA[i] + "  ");
    
         
    
    }
}
