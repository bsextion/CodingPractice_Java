package com.RES;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutation {
    public static void main(String[] args) {
        findPermutations(new int[] {1,2,3});

    }
    public static List<List<Integer>> findPermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(new ArrayList<>());
        //queue
        //add empty from queue
        //for num in nums:
        for(int n = 0; n < nums.length;n++){
            int intialSize = queue.size();
            for(int i = 0; i < intialSize; i++){
                List<Integer> popped = queue.poll();
                int index = 0;
                while(index <= n){
                    List<Integer> subperm = new ArrayList<>(popped);
                    subperm.add(index, nums[n]);
                    if (subperm.size() == nums.length){
                        result.add(subperm);
                    }
                    queue.add(subperm);
                    index += 1;
                }
            }
        }
        // TODO: Write your code here
        return result;
    }
}
