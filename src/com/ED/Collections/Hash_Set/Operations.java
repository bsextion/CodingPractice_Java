package com.ED.Collections.Hash_Set;

import java.util.HashSet;

public class Operations {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        hashSet.remove(4); //remove 4 from set
        hashSet.removeAll(secondSet); //remove all elements in secondset that exists in set
        hashSet.removeIf(x -> x%2 == 0); //remove all even numbers from set
        hashSet.clear(); //remove all elements

        hashSet.isEmpty(); //check if hashset is empty or not
    }
}
