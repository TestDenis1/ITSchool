package com.mycompany.task_1;

public class Parent {
    
    String s, a;
    
    
    public static void parent()
    {
        System.out.println("Статический блок класса Parent");
    }
    
    
    
    public void test(String a)
    {
        this.a = a;
        System.out.println("Не cтатический метод класса " + a);
    }
    
    
    
        Parent(String s){
        this.s = s;
        System.out.println("Конструктор класса " + s);
    }
}
