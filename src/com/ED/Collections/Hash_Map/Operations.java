package com.ED.Collections.Hash_Map;

import java.util.HashMap;

public class Operations {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> secondMap = new HashMap<>();

        hashMap.put("A", 5);

        hashMap.containsKey("A"); //check if key exists
        hashMap.containsValue(5); //check if value exists

        hashMap.keySet(); //gets all keys from map as a set
        hashMap.values(); //get alls values from map as a collection

        hashMap.compute("A", (k,v) -> v == null ? 10: v * 10); //perform computation for a value at key, check if null and returns 10 or 50

        hashMap.computeIfAbsent("A", k -> k.length()); //only works if key isn't present or key has null value
        hashMap.computeIfAbsent("A", k -> k.length()); //only works if key is present or key has null value

        hashMap.forEach((k,v) -> secondMap.merge(k,v, (v1,v2) -> v1 +v2 )); //merge two maps


    }
}
