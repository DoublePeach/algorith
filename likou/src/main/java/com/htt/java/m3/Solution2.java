package com.htt.java.m3;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution2 {

    // 滑动窗口解法
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = 0; int end = 0;
        int res = 1;
        int index = 0;
        while(end < chars.length){
            while(chars[index] != chars[end+1]){
//                res = Math.max(res,end-start+1);
                res++;
                index++;
                end++;
            }
            end++;
        }
        return 0;
    }

}

