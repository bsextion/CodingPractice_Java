package com.ED.DS.Arrays;

import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {

    }


    public static int[] removeEven(int[] arr) {
        int [] sorted = Arrays.stream(arr).filter(x -> x % 2 != 0).toArray();
        return sorted;
    }
}
