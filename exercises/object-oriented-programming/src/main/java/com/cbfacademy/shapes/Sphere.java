package com.cbfacademy.shapes;

public class Sphere extends Shape {
    protected double radius;

    public double getRadius(){
        return radius;
    }
    
   @Override protected double area(){
     return 4* Math.PI * Math.pow(this.radius, 2);
   }
}
