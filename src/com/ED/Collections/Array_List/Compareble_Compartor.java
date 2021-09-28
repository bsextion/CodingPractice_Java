package com.ED.Collections.Array_List;

import java.util.*;

public class Compareble_Compartor {
    static class Employee implements Comparable<Employee> {

        String name;
        int age;

        public Employee(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Employee emp){
            return (this.age - emp.age);
        }
    }

    public static class Vehicle {

        String brand;
        Integer makeYear;

        public Vehicle(String brand, Integer makeYear) {
            super();
            this.brand = brand;
            this.makeYear = makeYear;
        }
    }
    public class MakeYearComparator implements Comparator<Vehicle> {

        @Override
        public int compare(Vehicle o1, Vehicle o2) {
            return o1.makeYear.compareTo(o2.makeYear);
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 69));
        list.add(new Employee("Alex", 54));



        Collections.sort(list);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Volkswagen", 2010));
        vehicles.add(new Vehicle("Audi", 2009));
        vehicles.add(new Vehicle("Ford", 2001));
        vehicles.add(new Vehicle("BMW", 2015));

        Collections.sort(vehicles, (v1,v2) -> v1.brand.compareTo(v2.brand));

    }
}
