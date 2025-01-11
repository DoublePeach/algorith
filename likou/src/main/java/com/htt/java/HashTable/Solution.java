package com.htt.java.HashTable;

import java.util.HashMap;

/**
 * 383. 赎金信
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            map.put(ransomNote.charAt(i),num);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)){
                map.remove(c,0);
            }
        }
        return map.isEmpty();
    }

}
