package com.RES;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++){
            int length = results.size();
            for (int x = 0;x < length; x++){
                List<Integer> subset = new ArrayList<>(results.get(x));
                subset.add(nums[i]);
                if (!results.contains(subset)){
                    results.add(subset);

                }
            }

        }
        // TODO: Write your code here
        return results;
    }

    public static void main(String[] args) {
        findSubsets(new int[] {1, 3, 3});

    }
}
