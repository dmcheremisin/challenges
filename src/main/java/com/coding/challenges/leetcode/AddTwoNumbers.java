package com.coding.challenges.leetcode;

//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order and each of their nodes contain a single digit.
// Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Example:
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2).setNext(new ListNode(4).setNext(new ListNode(3)));
        ListNode l2 = new ListNode(5).setNext(new ListNode(6).setNext(new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println(result); // 7 -> 0 -> 8
        l1 = new ListNode(1).setNext(new ListNode(9));
        l2 = new ListNode(9);
        result = addTwoNumbers(l1, l2);
        System.out.println(result); // 0 -> 0 -> 1
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null, current = null;
        int reminder = 0;
        while(l1 != null || l2 != null) {
            l1 = l1 != null ? l1 : new ListNode(0);
            l2 = l2 != null ? l2 : new ListNode(0);
            int sum = l1.val + l2.val + reminder;
            reminder = sum / 10;
            if(root == null) {
                current = root = new ListNode(sum % 10);
            } else {
                current.next = new ListNode(sum % 10);
                current = current.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(reminder == 1) {
            current.next = new ListNode(1);
        }
        return root;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public ListNode setNext(ListNode next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return next == null ? val + "" : val + " -> " + next.toString() ;
    }
}