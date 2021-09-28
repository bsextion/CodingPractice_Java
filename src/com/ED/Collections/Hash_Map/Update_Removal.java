package com.ED.Collections.Hash_Map;

import java.util.HashMap;

public class Update_Removal {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 5);
        hashMap.get("A"); //returns value at key, returns null if key doesn't exist
        hashMap.getOrDefault("B", 100); //gets value at key, if key doesn't exists sets and returns default

        hashMap.replace("A", 5, 10); //checks current value is equal to old and replaces with new value
        hashMap.replace("A", 15); //replaces value at key with new value, if value doesn't exists return null
        hashMap.replaceAll((k,v) -> v + 10); //updates all values in map to add 10 to values

        hashMap.remove("A"); //remove key from map, returns null if key doesn't exists
        hashMap.remove("B", 5); //remove key if value is is equal to current value, returns true or false is item is moved



    }
}
