package com.htt.java.QuestionOfDay;

import java.util.Arrays;

/**
 * 1984. 学生分数的最小差值
 * 给你一个 下标从 0 开始 的整数数组 nums ，其中 nums[i] 表示第 i 名学生的分数。另给你一个整数 k 。
 * 从数组中选出任意 k 名学生的分数，使这 k 个分数间 最高分 和 最低分 的 差值 达到 最小化 。
 * 返回可能的 最小差值 。
 */
public class q_1984 {

    public static void main(String[] args) {
        System.out.println(minimumDifference3(new int[]{9,4,1,7},3));
    }
    public static int minimumDifference(int[] nums, int k) {
        int length = nums.length;
        if (length <= 1){
            return 0;
        }
        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;
        int minRes = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            maxV = Math.max(maxV,nums[i]);
            minV = Math.min(minV,nums[i]);
            if (i < k-1){
                continue;
            }
            minRes = Math.min(minRes,maxV-minV);
            int j = i-k+2;
            i++;
            maxV = Integer.MIN_VALUE;
            minV = Integer.MAX_VALUE;
            while(j<=i){
                maxV = Math.max(maxV,nums[j]);
                minV = Math.min(minV,nums[j]);
                j++;
            }
        }
        return minRes;
    }


    public static int minimumDifference2(int[] nums, int k) {
        int length = nums.length;
        if (length <= 1){
            return 0;
        }

        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;
        int minRes = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            maxV = Math.max(maxV,nums[i]);
            minV = Math.min(minV,nums[i]);
            if (i < k-1){
                continue;
            }
            minRes = Math.min(minRes,maxV-minV);
            int j = i-k+2;
            i++;
            maxV = Integer.MIN_VALUE;
            minV = Integer.MAX_VALUE;

        }
        return minRes;
    }

    public static int minimumDifference3(int[] nums, int k) {
        if(k == 1)
            return 0;
        Arrays.sort(nums);
        int ans = 100005;
        for(int i = 0; i <= nums.length - k; i++)
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        return ans;
    }
}
