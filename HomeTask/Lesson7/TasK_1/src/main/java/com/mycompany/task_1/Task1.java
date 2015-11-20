package com.mycompany.task_1;

public class Task1 {
    
    public static void main(String[] args){
        
        Parent par = new Parent("Parent");
        
        par.test("Parent");
        par.parent();
        
        Child ch = new Child("Chield");
        
       ch.test("Chield");
       ch.child();
    }
    
}
