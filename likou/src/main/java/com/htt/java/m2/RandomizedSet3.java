package com.htt.java.m2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RandomizedSet3 {

    ArrayList<Integer> nums;
    Map<Integer, Integer> map;
    Random random ;
    public RandomizedSet3() {
        nums = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        int index = nums.size() - 1; // 对应nums中的下标位置
        nums.add(val); // 存入变长数组
        map.put(val, index); // K：val值 ，V：值所在的下标位置
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        nums.remove(index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        random = new Random(nums.size());
        return random.nextInt();
    }
}