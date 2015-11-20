package com.mycompany.task_1;

public class Child extends Parent {
    
   public static void child()
    {
       System.out.println("Статический блок класса Child");
    }
       
   
  
   /*public void childA()
    {
        System.out.println("Не статический метод класса Child");
    }*/

    
 
    Child(String s) {
      super(s);
     }
    
    
    
}
