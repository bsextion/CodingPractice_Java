package com.ED.Collections.Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Problem 1: Find employees aged over 50#
//Problem 2: Find employees from the USA#
//Problem 3: Sort employees by country#
public class Exc1 {
    public static class Employee {

        String name;
        int age;
        String country;

        public Employee(String name, int age, String country) {
            super();
            this.name = name;
            this.age = age;
            this.country = country;
        }

    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        List<Employee> over50 = new ArrayList<>(list);
        over50.removeIf(em -> em.age <= 50);

        list.removeIf(em -> em.country.equals( "USA" ));
        Collections.sort(list, (em1, em2) -> em1.country.compareTo(em2.country));

    }
}
