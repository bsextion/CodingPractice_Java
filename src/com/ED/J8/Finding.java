package com.ED.J8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Finding {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23,"India"));list.add(new Person("Joe", 18,"USA"));
        list.add(new Person("Ryan", 54,"Canada"));list.add(new Person("Iyan", 5,"India"));
        list.add(new Person("Ray", 63,"China"));

        Optional<Person> personFirst = list.stream().filter(x -> x.getCountry().equals("India")).findFirst(); //find the first person from India
        Person personAny = list.stream().filter(x -> x.getCountry().equals("India")).findAny().get(); //find any person from India

        System.out.println(personAny);

        if (personFirst.isPresent()){
            System.out.println(personFirst);
        }
    }
}
