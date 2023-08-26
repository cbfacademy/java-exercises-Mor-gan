package com.cbfacademy.shapes;

public class Cylinder extends Shape{
    protected double height;
    protected double radius;
    
    @Override public double area(){
return this.height*Math.PI * Math.pow(this.radius, 2);
    }
}
