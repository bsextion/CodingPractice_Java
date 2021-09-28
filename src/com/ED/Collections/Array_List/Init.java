package com.ED.Collections.Array_List;

import java.util.ArrayList;
import java.util.List;

public class Init {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        List<Integer> mylist = new ArrayList<>(50);
        List<Integer> secondList = new ArrayList<>(originalList); //contain all elements in the same order
        mylist.add(22);mylist.add(2);mylist.add(10);
        mylist.stream().mapToInt(x -> x * 20).sum();


    }
}
