package com.htt.java.QuestionOfDay;

/**
 * 2269. 找到一个数字的 K 美丽值
 * 一个整数 num 的 k 美丽值定义为 num 中符合以下条件的 子字符串 数目：
 * 子字符串长度为 k 。
 * 子字符串能整除 num 。
 * 给你整数 num 和 k ，请你返回 num 的 k 美丽值。
 * 注意：
 * 允许有 前缀 0 。
 * 0 不能整除任何值。
 * 一个 子字符串 是一个字符串里的连续一段字符序列。
 */
public class q_2269 {

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240,2));
    }
    public static int divisorSubstrings(int num, int k) {
        char[] cs = String.valueOf(num).toCharArray();
        int length = cs.length;
        if (k > length){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int count = 0;
        while (x < k) {
            sb.append(cs[x]);
            x++;
        }
        for (int i = k-1; i < length ; i++) {
            int currNum = Integer.parseInt(sb.toString());
            if (currNum != 0 && num % currNum == 0) {
                count++;
            }
            sb.deleteCharAt(0);
            if (i+1 ==length ) break;
            sb.append(cs[i+1]);
        }
        return count;
    }

}
