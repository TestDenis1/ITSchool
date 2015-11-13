package com.mycompany.task_3;

public class Task_3 {
    
    public static void main(String[] arg){
        
        byte b = 100;
        byte b1 = 100;
        
        short s = (short) (b * b1);
        short s1 = 200;
        
        System.out.println("byte to short: " + s);
        System.out.println();
        
        int i = (int) s * s1;
        int i1 = 100000;
        
        char c = 100;
        
        System.out.println("char c = " + c);
        System.out.println("int to char: " + (int)c);
        System.out.println();
        
        System.out.println("short to int: " + i);
        System.out.println();
        
        long l = (long) i * i1;
        long l1 = 30000000;
        
        System.out.println("int to long: " + l);
        System.out.println();
        
        float f = (float)(i1);
        
        System.out.println("int to float: " + f);
        System.out.println();
        
        double d =(int)(double) l / l1;
        
        System.out.println("int to double: " + d);
        
        
        
    }
}
