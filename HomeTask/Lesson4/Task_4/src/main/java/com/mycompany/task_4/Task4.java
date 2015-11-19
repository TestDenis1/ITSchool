package com.mycompany.task_4;

public class Task4 {

    public static void main(String[] args){
        
        byte b = Byte.MAX_VALUE;
        b = (byte) (b + 2);
        byte b1 = Byte.MIN_VALUE;
        b1 = (byte) (b1 - 2);
        
        System.out.println(b);
        System.out.println(b1);
        
        
        short s = Short.MAX_VALUE;
        s = (short) (s + 1);
        short s1 = Short.MIN_VALUE;
        s1 = (short) (s1 - 1);
        
        System.out.println(s);
        System.out.println(s1);
        
        int i = Integer.MAX_VALUE;
        i = i + 1;
        int i1 = Integer.MIN_VALUE;
        i1 = i1 - 1;
        
        System.out.println(i);
        System.out.println(i1);
        
        long l = Long.MAX_VALUE;
        l = l + 2;
        long l1 = Long.MIN_VALUE;
        l1 = l1 - 1;
        
        System.out.println(l);
        System.out.println(l1);
        
    }
}
