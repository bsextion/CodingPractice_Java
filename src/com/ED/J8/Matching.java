package com.ED.J8;

import java.util.ArrayList;
import java.util.List;

public class Matching {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23,"India"));list.add(new Person("Joe", 18,"USA"));list.add(new Person("Ryan", 54,"Canada"));list.add(new Person("Iyan", 5,"India"));list.add(new Person("Ray", 63,"China"));

        boolean anyCanadian = list.stream().anyMatch(x -> x.getCountry().equals("Canada")); //prints true/false if there is at least one person from Canada
        boolean allCanadian = list.stream().allMatch(x -> x.getCountry().equals("Canada")); //prints true/false if all people are from Canada
        boolean noCandaian = list.stream().noneMatch(x -> x.getCountry().equals("Canada")); //prints true/false if no one is Canadian

    }
}
