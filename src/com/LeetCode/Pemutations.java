package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pemutations {
    public static void main(String[] args) {
        findSubarrays(new int[]{2, 5, 3, 10});
    }

    public static List<List<Integer>> findSubarrays(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        getPermutations(list);
        return subarrays;
    }

    public static List<List<Integer>> getPermutations(List<Integer> list){

        List<List<Integer>> permuations = new ArrayList<>();
        for(int i = 0; i < list.size();){
            list.remove(i);
            List<List<Integer>> subPermuation = getPermutations(list);
            for (int x = 0; x < subPermuation.size(); x++){
                List<Integer> temp = new ArrayList<>();
                temp.add(list.get(i));
//                temp.add(subPermuation.get(i));
                permuations.add(temp);
            }
        }
        return permuations;
    }
}


//    public static List<Integer> permuation(List<Integer> list){
//        if (list.size() == 0){
//            return new ArrayList<>();
//        }
//        List <Integer> permuations = new ArrayList();
//
//        for (int i = 0; i < list.size(); i++) {
//            permuations.remove(i);
//            List<Integer> subpermutation = permuation(list);
//            for (Integer perm: subpermutation){
//                permuations.add(list.get(i));
//                permuations.add(perm);
//            }
//
//        }
//        return permuations;
//
//    }
//}