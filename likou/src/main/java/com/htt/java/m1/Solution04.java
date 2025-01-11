package com.htt.java.m1;

import java.util.Arrays;

/**
 * 26. 删除有序数组中的重复项
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。
 * nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 */
public class Solution04 {
    public static void main(String[] args) {
//        int i = removeDuplicates(new int[]{1, 2,2,2,3,4});
        int i = removeDuplicates2(new int[]{0,0,1,1,1,1,2,3,3});
        System.out.println(i);

    }

    public static int removeDuplicates2(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    /*public static int removeDuplicates2(int[] nums) {
        int slow = 0; int fast = 1;
        int num = 1; //表示快慢指针之间的距离，也就是相同数字出现的次数
        while(fast<nums.length){
            if (nums[slow] == nums[fast]){
                fast++;
                num++;
                continue;
            }else {
                if (num>1){
                    for (int i = slow+2; i <fast; i++) {
                        nums[i] = nums[fast];  // 将这些相同的数都转变为下一个数的所有相同集合，即将下一个数整体向左移
                    }
                    nums[slow+2] = nums[fast];
                    slow+=2;
                    num = 1;
                    continue;
                }else{
                    nums[slow+1] = nums[fast];
                }
            }
            fast ++;
            slow++;
        }
        System.out.println(Arrays.toString(nums));
        return slow+1;
    }*/

    public static int removeDuplicates(int[] nums) {
        int slow = 0; int fast;
        for (fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]){
                nums[slow+1] = nums[fast];
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return slow+1;
    }


}
