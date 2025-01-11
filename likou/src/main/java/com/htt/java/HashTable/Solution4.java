package com.htt.java.HashTable;

import java.util.*;

/**
 * 49. 字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Solution4 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String kay = new String(chars); // 将排序后的数组作为map的key<String>
            List<String> list = map.getOrDefault(kay, new ArrayList<>());
            list.add(str);
            map.put(kay,list);
        }
        return new ArrayList<>(map.values());
    }

}
