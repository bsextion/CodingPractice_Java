package com.ED.Collections.Hash_Set;

import java.util.*;


public class Itr_Sorting {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> iterator = hashSet.iterator();

        hashSet.add(5);hashSet.add(15);
        for(Integer integer: hashSet){
            System.out.println(integer);
        } //iterate through set in for loop
        while (iterator.hasNext()){ //iterate through set with iterator
            System.out.println(iterator.next());
        } //iterate through set with iterator
        hashSet.stream().forEach(System.out::println); //iterate with stream

        List<Integer> list = new ArrayList<>(hashSet); //hashset converted to list to be sorted
        Collections.sort(list);

    }
}
