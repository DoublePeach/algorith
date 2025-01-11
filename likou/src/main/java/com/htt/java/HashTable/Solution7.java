package com.htt.java.HashTable;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class Solution7 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = 1,len = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;//去重
            }
            if(nums[i] == nums[i-1] + 1){
                len++;
            } else len = 1;
            res = Math.max(res,len);
        }
        return nums.length == 0 ? 0 : res;
    }

}

