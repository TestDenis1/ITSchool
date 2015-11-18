 package com.mycompany.task_2;

public class Module1 {
    
    private double a; 
    private int b; 

    public double moduleDev(double a, int b){ 
    this.a = a; 
    this.b = b; 
    double res = a % b; 
    System.out.println("Result division of module : " + res); 
    return res; 
    } 

    public void moduleRestDev(double a, int b){ 
    this.a = a; 
    this.b = b; 
    if(a % b == 0){ 
    System.out.println("Результат деления нацело : " + (a % b == 0)); 
    }else{ 
    System.out.println("Результат деления c остатком : " + (a % b == 1));
    } 
   }   
}
