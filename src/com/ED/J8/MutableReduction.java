package com.ED.J8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MutableReduction {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Dave", 23,20000));list.add(new Employee("Joe", 18,40000));list.add(new Employee("Ryan", 54,100000));list.add(new Employee("Iyan", 5,34000));list.add(new Employee("Ray", 63,54000));

        Optional<Integer> totalSalary = list.stream().map(x -> x.getSalary()).reduce((p,q) -> p+q); //grabs the total sum of all employee salaries
        int totalSalary2 = list.stream().mapToInt(x -> x.getSalary()).sum();  //grabs the total sum of all employee salaries using sum'

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);list2.add(2);list2.add(3);list2.add(4);list2.add(5);list2.add(6);

        int totalSum = list2.stream().reduce(5, (sum, num) -> sum + num); //gets sum, if stream empty 5 will be returned otherwise add 5 to sum

        int max = list2.stream().max(Comparator.naturalOrder()).get(); //gets largest num from list
        int min = list2.stream().min(Comparator.naturalOrder()).get(); //gets smallest num from list

    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
