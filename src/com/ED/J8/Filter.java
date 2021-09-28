package com.ED.J8;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23, "USA"));list.add(new Person("Joe", 18, "Canada"));
        list.add(new Person("Ryan", 54, "England"));list.add(new Person("Iyan", 5, "USA"));
        list.add(new Person("Ray", 6, "Mexico"));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);list2.add(12);list2.add(23);list2.add(45);list2.add(6);
        list2.stream().sorted((x,x1) -> x - x1).filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));
        list.stream().filter(p -> p.getAge() > 18 && p.getAge() < 60).forEach(p1 -> System.out.println(p1.getAge()));

    }
}
