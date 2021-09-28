package com.ED.Collections.Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterate_ {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        stockPrice.put("Oracle", 56);stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);stockPrice.put("Microsoft", 213);

        Set<Map.Entry<String,Integer>> entrySet = stockPrice.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        for (Map.Entry<String, Integer> entry : entrySet){ //iterate with entryset
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        while(iterator.hasNext()){ //iterate with iterator
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(iterator.next());
        }

        stockPrice.forEach((k,v) -> System.out.println(k + " " + v)); //iterate with for each









    }
}
