package com.htt.java.HashTable;

import java.util.HashMap;

/**
 * 219. 存在重复元素 II
 * 给你一个整数数组 nums 和一个整数 k ，
 * 判断数组中是否存在两个 不同的索引 i 和 j ，
 * 满足 nums[i] == nums[j] 且 abs(i - j) <= k 。
 * 如果存在，返回 true ；否则，返回 false 。
 */
public class Solution6 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k ){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

}

