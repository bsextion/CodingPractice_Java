package com.ED.Collections.Array_List;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 2, 8};

        System.out.println(findLength("araaci", 1));



//        List<Integer> myList = new ArrayList<>();
//        myList.add(15);myList.add(10);myList.add(5);myList.add(20);
//        Collections.sort(myList); //sort list
//        Collections.sort(myList, Collections.reverseOrder());
//
//       List<Integer> sortedList = myList.stream().sorted().collect(Collectors.toList()); //sort list with streams
//       List<Integer> sortedReverse = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()); //rverse sort with streams
//       System.out.println(sortedReverse);

    }
    public static int findLength(String str, int k) {
        //convert string to charaary
        int maxSize = 0;
        int lftPtr = 0;
        int rgtPtr = 1;

        //while leftPointer <= rightPointer && rightPointer < str.leng
        while(lftPtr <= rgtPtr && rgtPtr < str.length() ){
            int distinct = (int) str.substring(lftPtr, rgtPtr).chars().count();
            if (distinct <= 2){
                rgtPtr += 1;
                maxSize = Math.max(maxSize, str.substring(lftPtr,rgtPtr).length()-1);
            }
            else {
                lftPtr += 1;
            }
        }
        // get copy of of array starting at leftPointer, rightPointer
        //if distinct (from stream) <= 2, move the rightPointer and maxSize = max(maxSize,currSize)
        //else,move leftPointer
        return maxSize;
    }
}

