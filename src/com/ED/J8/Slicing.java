package com.ED.J8;

import java.util.ArrayList;
import java.util.List;

public class Slicing {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");countries.add("USA");countries.add("China");countries.add("India");countries.add("UK");countries.add("China");

        countries.stream().distinct().forEach(System.out::println); //only grab distinct elements

        countries.stream().limit(3).forEach(System.out::println); //only print 3 elements

        countries.stream().skip(3).forEach(System.out::println); //skip the first 3 elements
    }
}
