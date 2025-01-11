package com.htt.java.QuestionOfDay;

public class q_643 {

    public static void main(String[] args) {

    }

    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double currCount = 0;
        for (int i = 0; i < nums.length; i++) {
            currCount += nums[i];
            if (i < k-1) {
                continue;
            }
            maxAvg = Math.max(maxAvg,currCount/k);
            currCount -= nums[i - k +1];
        }
        return maxAvg;
    }
}
