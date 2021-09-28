package com.ED.Collections.Array_List;

import java.util.*;

public class Operations {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> otherList = new ArrayList<>();

        myList.isEmpty(); //check is list is empty

        myList.add(5); //add to the end
        myList.add(1,5); //add at pos 5, will throw error if index <0 or index > list size
        myList.addAll(otherList); //add the elements of another list at the end
        myList.addAll(5, otherList); //add the elements of another list at pos 5

        myList.get(3);
        myList.size();

        myList.remove(2); //remove item at index 2
        myList.remove(new Integer(2)); //remove first occurence of 2
        myList.removeAll(otherList); //remove all items in otherList that is found in firstlist
        myList.subList(0,1); //remove from index 0 to 1
        StringBuilder word = new StringBuilder();
        char [] arr = new char[]{'c','a', 'b'};
        Arrays.sort(arr);
        System.out.println(arr);

        myList.clear();

        myList.replaceAll(el -> el * 2); //perform operations on all elements in array. i.e the result will be all numbers * 2

        myList.set(0, 2); //update value at index 0
        boolean isFound = myList.contains(10); //returns true or false if object is in list
        myList.indexOf(2); //first index of 2
        myList.lastIndexOf(2); //last index of 2








    }
}
