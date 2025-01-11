package test.newGongsi;

import java.util.*;

public class Main {
    public int findRepeatNum (ArrayList<Integer> nums) {

        // write code here
        int slow = nums.get(0);
        int fast = nums.get(0);
        do {
            slow = nums.get(slow);
            fast = nums.get(fast);
        }while(slow != fast);
        slow = nums.get(0);
        while(slow != fast){
            slow = nums.get(slow);
            fast = nums.get(fast);
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public static int singleNumber(int[] nums) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
                continue;
            }
            set.add(nums[i]);
        }
        int res = 0;
        if (set.iterator().hasNext()){
            res = (int) set.iterator().next();
        }
        return res;
    }



    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while(j<nums.length){
                curr *= nums[i];
                if (curr >= max){
                    max = curr;
                }else {
                    j++;
                }
            }

        }
        return max;
    }
}
