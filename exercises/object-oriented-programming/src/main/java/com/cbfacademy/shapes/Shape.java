package com.cbfacademy.shapes;

public abstract class Shape {
    protected abstract double area();
    String shapeName;

    public String toString() {
        return this.shapeName;
    }

}
