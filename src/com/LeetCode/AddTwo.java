package com.LeetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddTwo {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode resultList = new ListNode();
            Stack<Integer> first = new Stack<>();
            Stack<Integer> second = new Stack<>();
            Queue<Integer> resultStack = new LinkedList<>();

            //for each element in linked list, store in a stack
            //once every element is in stack,
            while (l1 != null || l2 != null){
                if (l1 != null){
                    first.push(l1.val);
                    l1 = l1.next;
                }
                if (l2 != null){
                    second.push(l2.val);
                    l2 = l2.next;
                }
            }
            //rem = 0 and carry = 0
            //while loop as long as either list has a value
            int firstPop = 0; int secPop = 0;
            int rem = 0; int carry = 0;
            while (!first.isEmpty() || !second.isEmpty()){
                firstPop = 0;
                if (!first.isEmpty())
                    firstPop = first.pop();

                secPop = 0;
                if (!second.isEmpty())
                    secPop = second.pop();

                int sum = firstPop + secPop + carry;

                if (sum >= 10){
                    rem = sum %10;
                    carry = sum/10;
                    resultStack.add(rem);
                }
                else{
                    resultStack.add(sum);
                    carry = 0;
                }


            }
            if (carry > 0){
                resultStack.add(carry);
            }

            ListNode head = resultList;
            while (!resultStack.isEmpty()){
                resultList.val = resultStack.poll();
                if(!resultStack.isEmpty()) {
                    resultList.next = new ListNode();
                    resultList = resultList.next;
                }
            }
            resultList = head;
            return resultList;

        }
    }

    static class Solution {
        public static void main(String[] args) {
            ListNode listNode = new ListNode();

            ListNode first = new ListNode(2);
            first.next = new ListNode(4);
            first.next.next = new ListNode(9);

            ListNode second = new ListNode(5);
            second.next = new ListNode(6);
            second.next.next = new ListNode(4);
            second.next.next.next = new ListNode(9);

            listNode.addTwoNumbers(first, second);


        }
    }
}

