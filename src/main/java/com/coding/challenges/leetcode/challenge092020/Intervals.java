package com.coding.challenges.leetcode.challenge092020;

//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//Example 1:
//
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//Output: [[1,5],[6,9]]
//Example 2:
//
//Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//Output: [[1,2],[3,10],[12,16]]
//Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

import java.util.Arrays;

public class Intervals {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int intLength = intervals.length;

        if (intLength < 1) {
            return new int[][]{newInterval};
        }

        int searchFrom = newInterval[0];
        int searchTo = newInterval[1];
        if (searchFrom > intervals[intLength - 1][1]) {
            int[][] resultArray = Arrays.copyOf(intervals, intLength + 1);
            resultArray[intLength] = newInterval;
            return resultArray;
        }
        if (searchTo < intervals[0][0]) {
            int[][] resultArray = new int[intLength + 1][];
            System.arraycopy(intervals, 0, resultArray, 1, intLength);
            resultArray[0] = newInterval;
            return resultArray;
        }
        if (searchFrom <= intervals[0][0] && searchTo >= intervals[intLength - 1][1]) {
            return new int[][]{newInterval};
        }

        int from = -1;
        int to = -1;

        for (int i = 0; i < intLength; i++) {
            int[] current = intervals[i];
            int[] previous = i == 0 ? intervals[i] : intervals[i - 1];

            if ((current[0] <= searchFrom && searchFrom <= current[1]) ||
                    (from == -1 && previous[0] < searchFrom && searchFrom < current[0]))
                from = i;

            if (current[0] <= searchTo || searchTo > current[1])
                to = i;
        }
        int[][] resultArray;
        from = Math.max(0, from);
        to = Math.max(to, from);
        boolean shouldInsert = searchFrom < intervals[from][0] && searchTo < intervals[to][0];
        if (shouldInsert) {
            resultArray = new int[intLength + 1][];
            System.arraycopy(intervals, 0, resultArray, 0, from);
            System.arraycopy(intervals, to, resultArray, from+1, intLength - to);
            resultArray[from] = newInterval;
            return resultArray;
        }
        int newFrom = Math.min(intervals[from][0], searchFrom);
        int newTo = Math.max(intervals[to][1], searchTo);
        int[] intervalForInsert = {newFrom, newTo};
        int newLength = intLength - (to - from);
        resultArray = new int[newLength][];

        System.arraycopy(intervals, 0, resultArray, 0, from);
        System.arraycopy(intervals, to, resultArray, from, intLength - to);
        resultArray[from] = intervalForInsert;

        return resultArray;
    }

}
