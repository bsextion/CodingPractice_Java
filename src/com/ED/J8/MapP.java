package com.ED.J8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapP {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dave");list.add("Joe");list.add("Ryan");list.add("Iyan");list.add("Ray");
//        list.stream().map(x -> x.length()).forEach(System.out::println);

        List<List<String>> list2 = new ArrayList<>();
        list2.add(Arrays.asList("a","b", "c", "d", "e"));
        list2.add(Arrays.asList("f","g", "h", "i", "j"));

        List<String> flattened = list2.stream().flatMap(s -> s.stream()).collect(Collectors.toList());


     }
}
