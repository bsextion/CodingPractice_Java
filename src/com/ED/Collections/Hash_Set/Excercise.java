package com.ED.Collections.Hash_Set;

import java.util.HashSet;
import java.util.Stack;

//You are given an array in which all the elements are unique except one element.
// You need to find the duplicate element.
public class Excercise {
    Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i: data){
            if (hashSet.add(i) == false){
               duplicate = i;
               break;
            }
            hashSet.add(i);
        }

        System.out.println(duplicate);





    }
}
