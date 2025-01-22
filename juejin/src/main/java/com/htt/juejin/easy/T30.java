package com.htt.juejin.easy;

/**
 * @Author htt
 * @Date 2025/1/21
 */
public class T30 {
    public static int solution(String s) {
        // write code here
        int kNum = 0;
        int uNum = 0;
        for (char c : s.toCharArray()){
            if (c == 'k' || c == 'K'){
                kNum++;
            }else if (c == 'u' || c == 'U'){
                uNum++;
            }
        }
        return kNum == uNum ? kNum : Math.min(kNum,uNum);
    }

    public static void main(String[] args) {
        System.out.println(solution("AUBTMKAxfuu") == 1);
        System.out.println(solution("KKuuUuUuKKKKkkkkKK") == 6);
        System.out.println(solution("abcdefgh") == 0);
    }
}
