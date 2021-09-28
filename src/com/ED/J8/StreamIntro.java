package com.ED.J8;

import java.util.ArrayList;
import java.util.List;

public class StreamIntro {
    public static void main(String[] args) {
        java.util.stream.Stream<Integer> stream = java.util.stream.Stream.of(1,2,4,6,8,9);
//        stream.forEach(p -> System.out.println(p));

        List<String> list = new ArrayList<>();
        list.add("a");list.add("b");list.add("c");list.add("d");
        java.util.stream.Stream<String> stringStream = list.stream();
        stringStream.forEach(s -> System.out.println(s));
    }
}
