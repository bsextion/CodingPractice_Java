package com.ED.Collections.Tree_Map;



import java.util.Comparator;
import java.util.TreeMap;

public class init {
    public static void main(String[] args) {
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder()); //store in reverse order
        reverseMap.put("Oracle", 43);reverseMap.put("Microsoft", 56); //put values in tree map
        reverseMap.put("Apple", 43);reverseMap.put("Novartis", 87);

        TreeMap<String, Integer> otherMap = new TreeMap<>();
        otherMap.put("Amazon", 5);
        reverseMap.putAll(otherMap); //copy all mappings into reverseMap




    }
}
