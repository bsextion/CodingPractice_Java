package com.ED.OOP.AbstractionInterface;

class Bird {
    public Bird(){}
    public void eat(){
        System.out.println(getClass().getSimpleName() + " is eating!");
    }
}

interface canFly{
    void flying();
    default void land(){
        System.out.println("Now landing");
    }
}

class Parrot extends Bird implements canFly {
    @Override
    public void flying() {
        System.out.println("Parrot is flying");
    }

}
class Penguin extends Bird {
       public void walk(){
           System.out.println("Penguin is walking");
       }
}

public class Interface {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();
        parrot.eat();
        parrot.flying();
        parrot.land();

        penguin.walk();

    }
}
