package com.RES;

import java.util.Arrays;

public class max_sumsub_k {
    public static void main(String[] args) {
        findMaxSumSubArray(2, new int[]{2, 1, 5,});
    }
    public static int findMaxSumSubArray(int k, int[] arr) {
        //if array size < k, return arr
        if (arr.length <= k){
            return Arrays.stream(arr).sum();
        }
        int start = 0;
        int maxSum = Arrays.stream(arr).limit(k).sum();
        int currentSum = Arrays.stream(arr).limit(k).sum();

        for(int x = k; x < arr.length; x++){
            currentSum -= arr[start];
            currentSum += arr[x];
            maxSum = Math.max(maxSum, currentSum);
            start += 1;
        }
        return maxSum;
    }
}
