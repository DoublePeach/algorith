package com.htt.java.QuestionOfDay;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/**
 * 739. 每日温度
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
 * 其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。
 * 如果气温在这之后都不会升高，请在该位置用 0 来代替。
 */
public class q_739 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(monotonicStack2(new int[]{73,74,75,71,69,72,76,73})));
    }

    // 第一次的思路（只有最大的数据用例通过不了）
    public static int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        int j;
        for (int i = 0; i < length; i++) {
            j = i + 1;

            while (j < length) {
                if (temperatures[i] < temperatures[j]) {
                    res[i] = j - i;
                    break;
                } else {
                    j++;
                }
            }
        }
        return res;
    }

    public int[] monotonicStack(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int prevI = stack.pop();
                ans[prevI] = i;
            }
            stack.push(i);
        }

        return ans;
    }


    // 自己写的
    public static int[] monotonicStack2(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {

            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                Integer currPop = stack.pop();
                res[currPop] = i - currPop;
            }
            stack.push(i);
        }

        return res;
    }



}
