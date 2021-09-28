package com.ED.J8;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingOperations {
    public static void main(String[] args) {
        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2("Alex", 23, 23000, "USA"));employeeList.add(new Employee2("Ben", 63, 25000, "China"));employeeList.add(new Employee2("Dave", 34, 56000, "India"));employeeList.add(new Employee2("Jodi", 43, 67000, "USA"));employeeList.add(new Employee2("Ryan", 53, 54000, "China"));

        Map<String, List<Employee2>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee2::getCountry)); //group by Country

        Map<String, Set<Employee2>> setMap = employeeList.stream().collect(Collectors.groupingBy(Employee2::getCountry, Collectors.toSet())); //group by country into set

        //group by country and age
        Map<String, Map<Integer, List<Employee2>>> employeeMap2 = employeeList.stream().collect(Collectors.groupingBy(Employee2::getCountry, Collectors.groupingBy(Employee2::getAge)));

        //store the country in key and total salary in map
        Map<String, Integer> countrySalaryMap = employeeList.stream().collect(Collectors.groupingBy(Employee2::getCountry, Collectors.summingInt(Employee2::getSalary)));

        //store the country in key and the max salary for that country
        Map<String, Optional<Employee2>> countrySalaryMaxMap= employeeList.stream().collect(Collectors.groupingBy(Employee2::getCountry, Collectors.maxBy(Comparator.comparingInt(Employee2::getSalary))));


        Map<String, Set<Employee2>> employeeMap4 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee2::getCountry, HashMap::new, Collectors.toSet()));


        //Partition the list based on age greater than 30, true is the key and values are employees whose ages are greater than 30
        Map<Boolean, List<Employee2>> booleanListMap = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

        System.out.println(booleanListMap);


    }
}

class Employee2 {
    String name;
    int age;
    int salary;
    String country;

    Employee2(String name, int age, int salary, String country) {
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

    public int getSalary() {
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