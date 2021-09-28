package com.ED.Collections.Tree_Set;

import java.util.TreeSet;

public class Operations {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);treeSet.add(6);treeSet.add(10);treeSet.add(20);

        treeSet.first(); //get first element, throws error if there is no elements
        treeSet.last(); //get last element, throws error if there is no elements

        treeSet.isEmpty(); //check if empty

        treeSet.subSet(5,10); //returns sorted set between elements

        treeSet.headSet(6); //returns elements smaller than element
        treeSet.tailSet(6); //returns elements larger than element

        treeSet.remove(10); //remove 10 from treeset, returns true or false if element not in treeset





    }
}
