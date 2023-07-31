package com.codingblackfemales.academy;

public class HelloWorld {
    // instance field
    public static void multiply(int a, int b){
    //    return a*b;
       System.out.println(a*b);
    }
    public static void main(String... args) {
        System.out.println("Hello World!");
          multiply(2,3);
    }
}