package com.htt.java.QuestionOfDay;

/**
 * 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class q_1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currCount = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            currCount += arr[i];
            if (i < k - 1) {
                continue;
            }
            if ((currCount / k) >= threshold) {
                num++;
            }
            currCount -= arr[i - k + 1];
        }
        return num;
    }
}
