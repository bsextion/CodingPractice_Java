package com.ED.OOP.ClassesObjects;
    class Car{
        static String engine; //shared by all instances of the class
        int speed; //shared by all instances of the class
        int capacity; //each instance has it's own value
        final int wheels = 4; //value cannot by changed

        //Setters
        public void setSpeed(int speed){
            this.speed = speed;
        }
        public void setCapacity(int capacity){
            this.capacity = capacity;
        }

        //Getters
        public int getSpeed(){
            return this.speed;
        }
        public int getCapacity(){
            return this.capacity;
        }

        //Methods with/without return value
        public void printSpeed(int carSpeed){
            System.out.println(carSpeed);
        }
        public int maxSpeed(int carSpeed){
            return (2 * carSpeed);
        }

}

class Demo{
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(60);
        System.out.println(car.getSpeed());
    }
}

