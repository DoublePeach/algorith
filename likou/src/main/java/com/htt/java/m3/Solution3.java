package com.htt.java.m3;
import java.util.Arrays;
/**
 * 1. 两数之和
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r1 = 0 , r2 = 0;
        Arrays.sort(nums);
        for(int i = 0,j=nums.length-1;i<j;){
            if(nums[i] + nums[j] == target){
                r1 = nums[i];
                r2 = nums[j];
            }else if(nums[i] + nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == r1){
                r1 = i;
            }else if (nums[i] == r2){
                r2 = i;
            }
        }
        return new int[]{r1,r2};
    }
}

