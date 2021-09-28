package com.ED.OOP.Inheritance;

class Vehicle {

    // Private Fields
    private String make;
    private String color;
    private int year;
    private String model;
    int fuelCap = 90;


    public Vehicle(){

    }
    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

}
class Motorcycle extends Vehicle {
    private String bodyStyle;
    public Motorcycle(String make, String color, int year, String model, String bodyStyle){
        super(make,color,year,model);
        this.bodyStyle = bodyStyle;
    }

    public void printCarDetails(){
        printDetails();
        System.out.println("Bodystyle" + this.bodyStyle);
    }

}

class Car extends  Vehicle{
    int fuelCap = 50;
    public Car(){}
    public Car(int fuelCap) {
        this.fuelCap = fuelCap;
    }
    public void display(){
        System.out.println(super.fuelCap); //calling the parent class fuelcap
        System.out.println(this.fuelCap);
    }
}

class Prius extends Car {// Derived from Prius & can be base to any further class

    public void turnOnHybrid() {
        System.out.println("The Hybrid mode is turned on!");
    }

}

public class Extends {
    public static void main(String[] args) {
        Car car = new Car(88);
        car.display();
        Prius prius = new Prius();
        prius.turnOnHybrid();
    }
}
