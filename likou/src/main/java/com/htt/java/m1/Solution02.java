package com.htt.java.m1;

/**
 * 415-字符串相加
 */
public class Solution02 {
    public static void main(String[] args) {
        System.out.println(addStrings("25","40"));
    }
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1 ;
        int j = num2.length() - 1 ;
        int add = 0; // 进位
        int res = 0; int x ,y;
        StringBuffer curr = new StringBuffer();
        while(i >= 0 || j >= 0 || add != 0){
            x = i>=0 ? num1.charAt(i) - '0' : 0;// 数据位不一致时补零
            y = j>=0 ? num2.charAt(j) - '0' : 0;// 数据位不一致时补零
            res = x + y + add;
            curr.append(res%10);
            add = res/10;
            i--;
            j--;
        }
        curr.reverse();
     return curr.toString();
    }
}
