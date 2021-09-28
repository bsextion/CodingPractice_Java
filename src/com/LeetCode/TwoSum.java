package com.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    //map to store values
    //for loop
    //check if (target - nums[i]) is in map
    //if is not in map, add nums[i] to map
    //if in map, return index and value at key
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for(int x = 0; x < nums.length; x++){
            int needed = target - nums[x];
            if (valueMap.containsKey(needed)) {
                int indexFound = valueMap.get(nums[x]);
                return new int[]{x, indexFound};
            }
            else
                valueMap.put(nums[x], x);
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }
}
