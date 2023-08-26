package com.cbfacademy.shapes;

public class Paint {
    protected double coverage;

    public double amount(Shape shape){
        double shapeArea = shape.area();
        return shapeArea / this.coverage;
    }
}
