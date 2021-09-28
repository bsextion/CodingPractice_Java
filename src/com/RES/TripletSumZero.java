package com.RES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TripletSumZero {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int number = arr[i];
            int start = i+1;
            int end = arr.length-1;
            while(start <= end){
                int sum = number + arr[start] + arr[end];
                if (sum == 0){
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(number);sublist.add(arr[start]);sublist.add(arr[end]);
                    sublist = sublist.stream().sorted().collect(Collectors.toList());
                    if (!triplets.contains(sublist)) {
                        triplets.add(sublist);
                    }
                        start += 1;
                        end -= 1;
                }
                else if (sum < 0){
                    start += 1;
                }
                else {
                    end -=1;
                }
            }
        }


        // TODO: Write your code here
        return triplets;
    }

    public static void main(String[] args) {
        searchTriplets(new int[] {-3, 0, 1, 2, -1, 1, -2});

    }
}
