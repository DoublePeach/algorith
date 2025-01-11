package com.htt.java.QuestionOfDay;

/**
 * 1456. 定长子串中元音的最大数目
 * 给你字符串 s 和整数 k 。
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 * 英文中的 元音字母 为（a, e, i, o, u）。
 */
public class q_1456 {
    public static void main(String[] args) {
//        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels2("abciiidef",3));
    }

    public static int maxVowels(String s, int k) {
        int maxV = -1;
        int count = 0;
        char[] cs = s.toCharArray();
        for (int i = 0,j=k-1; j < s.length()-k + 1; i++,j++) {
            int x = i,y = j;
            int nextStar = x + k;
            while(x <= y){
               if (cs[x] == 'a' || cs[x] == 'e' || cs[x] == 'i' || cs[x] == 'o' || cs[x] == 'u'){
                   count++;
                   nextStar = x ;
               }
               x++;
            }
            maxV = Math.max(maxV,count);
            i = nextStar;
            j = nextStar + k;
        }
        return maxV == -1 ? 0 : maxV;
    }


    public static int maxVowels2(String S, int k) {
        char[] s = S.toCharArray();
        int ans = 0;
        int vowel = 0;
        for (int i = 0; i < s.length; i++) {
            // 1. 进入窗口
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                vowel++;
            }
            if (i < k - 1) { // 窗口大小不足 k
                continue;
            }
            // 2. 更新答案
            ans = Math.max(ans, vowel);
            // 3. 离开窗口
            char out = s[i - k + 1];
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                vowel--;
            }
        }
        return ans;
    }

}
