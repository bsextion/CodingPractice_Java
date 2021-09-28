package com.RES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAnagram {
    public static void main(String[] args) {
        findStringAnagrams("abbcabc", "abc");
    }
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        char [] arr = pattern.toCharArray();
        Arrays.sort(arr);
        String sortedPattern = new String(arr);
        int patternSize = sortedPattern.length();
        int start = 0;
        int end = patternSize;

        while(end <= str.length()){
            char [] sorted = str.substring(start, end).toCharArray();
            Arrays.sort(sorted);
            String sub = new String(sorted);
            if (sub.equals(sortedPattern)){
                resultIndices.add(start);
            }
            start += 1;
            end += 1;
        }
        return resultIndices;
    }
}
