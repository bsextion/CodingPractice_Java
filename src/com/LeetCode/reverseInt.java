package com.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class reverseInt {
    public static int reverse(int x) {
        boolean isPositive = x >= 0 ? true : false;
        Queue<Integer> queue = new LinkedList<>();

        int result = 0;
        if (!isPositive){
            x *= -1;
        }

        while (x > 0){
            int rem = x % 10;
            x = (x/10) ;
            result = (result * 10) + rem;

        }

        if (!isPositive){
            x *= -1;
        }

        return result;

    }

    public static void main(String[] args) {
        reverse(28);
    }
}
