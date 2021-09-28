package com.ED.OOP.DataHiding;

public class Challenge {
    class Rectangle {

        int length;
        int width;

        public Rectangle() {
            this.length = 0;
            this.width = 0;


        }

        public Rectangle(int length, int width) {

            this.length = length;
            this.width = width;


        }

        public int getArea() {
            return (this.length * this.width);
        }

    }
}
