package com.ED.Collections.Linked_List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Init {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> secondLinkedList = new LinkedList<>();
        linkedList.add(5);linkedList.add(7);


        linkedList.addAll(secondLinkedList);
        linkedList.add(1,20);

        linkedList.getFirst(); //get first element
        linkedList.getLast(); //get last element
        linkedList.get(2); //get elment at index 2

        Collections.sort(linkedList);
        System.out.println(linkedList);

        linkedList.removeFirst(); //remove first
        linkedList.removeLast(); //remove last

        linkedList.remove(2); //remove at index 2
        linkedList.remove(new Integer(3)); //remove first occurence of 3
        linkedList.removeLastOccurrence(new Integer(3)); //remove last occurence of 3



    }
}
