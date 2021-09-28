package com.ED.Collections.Tree_Set;

import java.util.TreeSet;

//Problem 1: Numbers greater than 50#
//Problem 2: Smallest and largest number in array#
public class Exercise {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i: numbers){
            treeSet.add(i);
        }
        System.out.println(treeSet.tailSet(50));

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
