package com.ED.Collections.Hash_Set;

import java.util.HashSet;
import java.util.Stack;

public class Init {
    public static void main(String[] args) {
        //Set doesn't maintain insertion order, elements inserted randomly

        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Inserting 4 in HashSet: " + hashSet.add(4)); //inserts 4, returns true or false if element already exists
        hashSet.contains(4); //returns true/false if element is in set

        Stack<Integer> stack = new Stack<>();



    }
}