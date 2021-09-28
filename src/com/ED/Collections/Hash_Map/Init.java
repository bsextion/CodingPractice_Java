package com.ED.Collections.Hash_Map;

import java.util.Arrays;
import java.util.HashMap;

public class Init {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> secondMap = new HashMap<>();
        secondMap.put("Z", 11);
        hashMap.put("A", 5); //adds key:value pair ("A:5), if key exists, value will be updated
        hashMap.putIfAbsent("B", 6); //adds key value pair if key doesn't already exists, of key exists value won't be updated
        hashMap.putAll(secondMap); //copies mappings from another map into map

        char [] arr = new char[]{'c','a', 'b'};
        Arrays.sort(arr);
        System.out.println(arr);

    }
}
