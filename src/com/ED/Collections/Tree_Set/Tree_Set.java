package com.ED.Collections.Tree_Set;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(21);list.add(32);list.add(44);list.add(11);list.add(54);

        TreeSet<Integer> treeSet = new TreeSet<>(); //does not allow null values, stored in sorted

        treeSet.add(6); //add 6 to tree set
        treeSet.addAll(list);


    }
}
