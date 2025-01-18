package com.htt.juejin.mid;

/**
 * @Author htt
 * @Date 2025/1/16
 */
public class T15 {
    public static int solution(String S, String T) {
        // write code here
        // 双指针

        char[] sCharArray = S.toCharArray();
        char[] tCharArray = T.toCharArray();
        boolean flag = sCharArray.length > tCharArray.length;
        int count = 0;
        for (int i = 0,j = 0; i < (flag ? tCharArray.length : sCharArray.length); i++,j++) {
            if (sCharArray[i] != tCharArray[j]){
                count++;
            }
        }
        int diff = sCharArray.length -tCharArray.length;
        return count + (flag ? diff : 0);
    }

    public static void main(String[] args) {
        System.out.println(solution("aba", "abb") == 1);
        System.out.println(solution("abcd", "efg") == 4);
        System.out.println(solution("xyz", "xy") == 1);
        System.out.println(solution("hello", "helloworld") == 0);
        System.out.println(solution("same", "same") == 0);
    }
}
