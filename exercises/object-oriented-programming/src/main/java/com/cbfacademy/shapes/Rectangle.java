package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    @Override
    public double area() {
        return this.length * this.width;
    }
}
