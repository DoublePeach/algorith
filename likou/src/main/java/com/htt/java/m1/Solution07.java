package com.htt.java.m1;

import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 */
public class Solution07 {
    public static void main(String[] args) {

    }

    /**
     * 摩尔投票法
     * @param nums 数组
     * @return 返回最多的那个数
     */
    public int singleNumber(int[] nums) {
        int major = nums[0]; // 定义众数
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0){
                count++;
                major = nums[i]; //更新众数
            } else if (nums[i] == major) {
                count++;
            }else {
                count--;
            }

        }
        return major;
    }


    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int count = counts.getOrDefault(nums[i], 0) + 1;
            //如果某个数字出现的个数已经超过数组的一半，自己返回
            if (count > length / 2)
                return nums[i];
            counts.put(nums[i], count);
        }
        return -1;
    }

    /**
     * 位运算求只出现了一次的数字
     */
    public int singleNumber2(int nums[]) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }

}
