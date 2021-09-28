package com.ED.Collections.Tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class Fetch_Remove {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Oracle", 43);map.put("Microsoft", 56);
        map.put("Apple", 76);map.put("Novartis", 87);

        map.get("Oracle"); //gets value by the key

        map.firstKey(); //gets the first key
        map.firstEntry(); //gets the first key:value entry (smallest)
        map.lastKey(); //gets the last key
        map.lastEntry(); //get the last key:value entry (largest)

        map.remove("Oracle"); //remove entry by key, returns value is key is present
        map.remove("Oracle", 43); //remove entry by key and value

        map.replace("Oracle", 4); //update value of key only if it's present in map=
        map.replace("Oracle", 43, 55); //update value with new if current value is in old value

        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey()).forEach(System.out::println);

    }
}
