package com.ED.OOP.ClassesObjects;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return (this.num1 + this.num2);
    }

    public double subtract() {
        return (this.num1 - this.num2);
    }

    public double multiply() {
        return (this.num1 * this.num2);

    }

    public double divide() {
        return (this.num1 / this.num2);

    }

}


    class Demo5 {
        public static void main(String[] args) {
            Calculator obj = new Calculator(10, 94);
            obj.add();
            obj.subtract();
            obj.multiply();
            obj.divide();
        }
}
