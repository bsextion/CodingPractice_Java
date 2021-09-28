package com.ED.J8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Dave", 34, 56000));employeeList.add(new Employee("Jodi", 43, 67000));employeeList.add(new Employee("Ryan", 53, 54000));

        long count = employeeList.stream().filter(x -> x.getAge() > 30).collect(Collectors.counting()); //count employees over 30
        long count2 = employeeList.stream().filter(x -> x.getAge() > 30).count(); //count employees over 30

        int sum = employeeList.stream().collect(Collectors.summingInt(x -> x.getSalary())); //get sum of employee salaries
        int sum2 = employeeList.stream().mapToInt(x -> x.getSalary()).sum(); //get sum of employee salaries

        double average = employeeList.stream().collect(Collectors.averagingInt(x -> x.getSalary())); //get average of salaries
        double average2 = employeeList.stream().mapToDouble(x-> x.getSalary()).average().getAsDouble(); //get average of salaries

        Employee lowestSalary = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get(); //get lowest salary
        Employee lowestSalary2 = employeeList.stream().collect(Collectors.minBy((x,x1) -> x.getSalary() - x1.getSalary())).get(); //get lowest salary

        Employee highestSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        Employee highestSalary2 = employeeList.stream().collect(Collectors.maxBy((x1,x2) -> x1.getSalary()-x2.getSalary())).get();

        IntSummaryStatistics summarizingInt = Stream.of("1", "2", "3")
                .collect(Collectors.summarizingInt(Integer::parseInt));
        System.out.println(summarizingInt);

        String joinedString = Stream.of("hello", "how", "are" , "you").collect(Collectors.joining()); //Joining all stings


        joinedString = Stream.of("hello", "how", "are" , "you").collect(Collectors.joining(" ")); //joining strings with space in between

        // Joining all the strings with space in between and a prefix and suffix.
        joinedString = Stream.of("hello", "how", "are" , "you").collect(Collectors.joining(" " , "prefix","suffix"));






    }
}
