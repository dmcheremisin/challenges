package com.coding.challenges.leetcode;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//You may assume nums1 and nums2 cannot be both empty.
//Example 1:
//nums1 = [1, 3]
//nums2 = [2]
//The median is 2.0
//Example 2:
//nums1 = [1, 2]
//nums2 = [3, 4]
//The median is (2 + 3)/2 = 2.5

class MedianOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalLen = len1 + len2;
        int[] result = new int[totalLen];

        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] <= nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
        while (i < len1)
            result[k++] = nums1[i++];
        while (j < len2)
            result[k++] = nums2[j++];

        if (totalLen % 2 != 0)
            return result[totalLen / 2];

        return ((double) result[totalLen / 2 - 1] + result[totalLen / 2]) / 2;
    }
}