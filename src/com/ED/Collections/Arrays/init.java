package com.ED.Collections.Arrays;

import java.util.Arrays;

public class init {
    public static class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is " + index);
        index = Arrays.binarySearch(numbers, 1, 5, 4);

        Employee[] employees = { new Employee(123, "Jay"), new Employee(124, "Roy"), new Employee(125, "Nikki"),
                new Employee(126, "Tom") };

         index = Arrays.binarySearch(employees, new Employee(124, "Roy"));
    }
}
