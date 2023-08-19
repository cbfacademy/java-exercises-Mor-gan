package com;

public class Car {
    String make;
    String model;
    int year;
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public static void main(String[] args) {
        // Instantiate three Car objects with different details
        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porshe", "Panema", 2009);
        Car car3 = new Car("Audi", "A3", 2018);

        // Retrieve and print car details
        System.out.println("Car 1: " + car1.getYear() + " " + car1.getMake() + " " + car1.getModel());
        System.out.println("Car 2: " + car2.getYear() + " " + car2.getMake() + " " + car2.getModel());
        System.out.println("Car 3: " + car3.getYear() + " " + car3.getMake() + " " + car3.getModel());
    }
}
