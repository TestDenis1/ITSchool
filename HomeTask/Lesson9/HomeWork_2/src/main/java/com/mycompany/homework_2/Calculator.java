package com.mycompany.homework_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    
    public static void main(String[] args) throws IOException{
        
       BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
     
        System.out.println("Введите перове число");
        String s1 = br.readLine().trim();
        
        byte a = Byte.parseByte(s1);
        
        System.out.println("Введите знак (+, - , * , /)");
        String s = br.readLine().trim();
        
        System.out.println("Введите второе число");
        String s2 = br.readLine().trim();
        
        byte b = Byte.parseByte(s2);
        
        switch(s){
            case "+":
               System.out.println(a + b); 
                break;
            case "-":
               System.out.println(a - b);
                break;
            case "*":
               System.out.println(a * b); 
                break;
            case "/":
               System.out.println(a / b); 
                break;
            default:
                System.out.println("Введен некорректный символ");
        } 
        
        
    }
    
}
