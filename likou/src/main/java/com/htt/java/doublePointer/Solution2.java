package com.htt.java.doublePointer;

/**
 * 392. 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 */
public class Solution2 {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char schat = s.charAt(i);
            while (schat != t.charAt(j) && j < t.length() - 1) {
                j++;
            }
            if (i == s.length()-1){
                return true;
            }
        }
        return false;
    }
}
