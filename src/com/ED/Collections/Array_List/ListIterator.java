package com.ED.Collections.Array_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);myList.add(10);

        Iterator<Integer> itr = myList.iterator();
        while (itr.hasNext()){
            int next = itr.next();
            if (next == 10)
                itr.remove(); //remove 10
        }
        System.out.println(myList);

        Iterator<Integer> iterator = myList.iterator();
        iterator.forEachRemaining(e -> System.out.println(e));


    }
}
