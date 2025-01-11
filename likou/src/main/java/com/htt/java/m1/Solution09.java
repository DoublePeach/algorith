package com.htt.java.m1;

/**
 * 45. 跳跃游戏 II
 *  给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
 *  每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
 *  0 <= j <= nums[i]
 *  i + j < n
 *  返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
 */
public class Solution09 {
    public static void main(String[] args) {
//        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
//        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
        System.out.println(jump(new int[]{3, 2, 1, 0, 4}));

    }

    public static int jump1(int[] nums) {
        if (nums[0] == 0 || nums.length == 1) {
            return 0;
        }
        int count = 0;
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i + nums[i] > rightmost) {
                count++;
            }
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return count;
                }
            }
        }
        return 0;
    }

    public static int jump(int[] nums) {
        int postion = nums.length-1;
        int count = 0;
        while(postion > 0){
            for (int i = 0; i < postion; i++) {
                if (i + nums[i] >= postion){
                    postion = i;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}


