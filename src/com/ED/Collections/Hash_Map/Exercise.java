package com.ED.Collections.Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Problem 1: Find the highest stock price#
//Problem 2: Find the average stock price#
//Problem 3: Remove companies with stock price below 50
public class Exercise {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();
        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet();
        Iterator<Entry<String, Integer>> iterator = stockPrice.entrySet().iterator();

        stockPrice.put("Oracle", 56);stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);stockPrice.put("TCS", 23);
        String company = "";
        int maxValue = 0;

        for(Map.Entry<String, Integer> entries: entrySet){
            if (entries.getValue() > maxValue){
                maxValue = entries.getValue();
                company = entries.getKey();
            }
        }

        while (iterator.hasNext()){
            Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 50){
                iterator.remove();
            }
        }

        System.out.println(company);
        int average = (int)stockPrice.values().stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);








    }
}
