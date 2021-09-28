package com.ED.OOP.ClassesObjects;

class Calculator1{
    public double product(double x, double y) {
        return x * y;
    }

    // Overloading the function to handle three arguments
    public double product(double x, double y, double z) {
        return x * y * z;
    }

    // Overloading the function to handle int
    public int product(int x, int y){
        return x * y;
    }
}

class Demo1 {
    public static void main(String[] args) {

    }
}
