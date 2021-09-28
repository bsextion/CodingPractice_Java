package com.ED.J8;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionOperations {
    public static void main(String[] args) {
        List<EmployeeD> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeD("Alex" , 23, 23000, "USA"));employeeList.add(new EmployeeD("Ben" , 63, 25000, "India"));
        employeeList.add(new EmployeeD("Dave" , 34, 56000, "Bhutan"));employeeList.add(new EmployeeD("Jodi" , 43, 67000, "China"));employeeList.add(new EmployeeD("Ryan" , 53, 54000, "Libya"));

        List <String> employeeDS = employeeList.stream().map(x -> x.getName()).collect(Collectors.toList()); //get the names of employees in seperate list
        Set<String> countries = employeeList.stream().map(x -> x.getCountry()).collect(Collectors.toSet()); //get the names of countries in set

        LinkedList<String> employeeNames = employeeList.stream().map(x -> x.getName()).collect(Collectors.toCollection(LinkedList::new)); //get employee name in ll

        List<String> list = new ArrayList<>();
        list.add("done");list.add("far");list.add("away");list.add("again");

        java.util.Map<String, Integer> names1 = list.stream().distinct().collect(Collectors.toMap(s -> s, s -> s.length())); //distinct to ensure no duplicate keys
        Map<String, Integer> names2 = list.stream().collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s1)); //make sure no duplicate keys
        HashMap<String, Integer> names3 = list.stream().collect(Collectors.toMap(s -> s, s -> s.length(), (s1,s2) -> s1, HashMap::new)); //convert to hashmap


    }
}

class EmployeeD {
    String name;
    int age;
    int salary;
    String country;

    EmployeeD(String name, int age, int salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}