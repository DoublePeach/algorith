package com.htt.java.QuestionOfDay;

/**
 * 3101. 交替子数组计数
 * 给你一个二进制数组nums 。
 * 如果一个子数组中 不存在 两个 相邻 元素的值 相同 的情况，我们称这样的子数组为 交替子数组 。
 * 返回数组 nums 中交替子数组的数量。
 * @Author htt
 * @Date 2024/7/6
 */
public class q_3101 {
    public static void main(String[] args) {
        System.out.println(countAlternatingSubarrays(new int[]{1,0,1,0}));
    }

    public static long countAlternatingSubarrays(int[] nums) {
        int count = 0;
        int i = 0 , j = 1;
        while (j < nums.length){
            while (nums[i] != nums[j] && j < nums.length){
                if (j-i == 1){
                    count ++;
                }
                i = j;
                j++;
            }
            if (j-i > 1){
                count += ((j-i)*(j-i-1))/2 ;

                j++;
            }
            i = j;
            j++;
        }


        return count + nums.length;
    }
}
