package com.spring.practice;

public class A {  
private static final A obj=new A();  
private A(){System.out.println("private constructor");}  
public static A getA(){  
    System.out.println("getA() is executed");  
    return obj;  
}  
public void message(){  
    System.out.println(" message executed");  
}  
}  
