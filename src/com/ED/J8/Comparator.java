package com.ED.J8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Person {

    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", country=" + country +
                 '}';
     }
}
public class Comparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Kyle", 52 ,"Canada");
        Person p2 = new Person("Jim", 33, "USA");
        persons.add(p1);persons.add(p2);

        Collections.sort(persons, (per1,per2) -> per1.getAge() - per2.getAge()); //sort by age
        Collections.sort(persons, (pr1, pr2) -> pr1.getName().compareTo(pr1.getName())); //sort by name

        persons.forEach(p -> System.out.println(p.getName()));

    }
}

