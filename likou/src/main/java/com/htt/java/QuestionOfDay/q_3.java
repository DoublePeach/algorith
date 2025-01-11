package com.htt.java.QuestionOfDay;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 * (子字符串 是字符串中连续的 非空 字符序列)
 */
public class q_3 {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        x1(5);
        x1(new Integer(5));
        ArrayList<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        x1(list);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int left = 0;
        int maxCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < cs.length; i++) {
            if (map.containsKey(cs[i])) {
                left = Math.max(left, map.get(cs[i]) + 1);
            }
            map.put(cs[i], i);
            maxCount = Math.max(maxCount, i - left + 1);
        }
        return maxCount;
    }


// 括号匹配、牛客模拟面试题
    public int longestValidParentheses (String s) {
        // write code here
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack();
        int count = 0;
        for(int i = 0;i<cs.length;i++){
            if(!stack.isEmpty()){
                if (stack.pop().equals('(') && cs[i] == ')'){
                    count += 2;
                }
            }
            stack.push(cs[i]);
        }
        return count;
    }


    public static void x1(int a){
        System.out.println("x1"+a);
    }
    public static void x1(Integer b){
        System.out.println("x2"+b);
    }
    public static void x1(ArrayList<String> c){
        System.out.println("x3"+Arrays.toString(c.toArray()));
    }
}
