package LeetCodeHot75;

import java.util.ArrayList;
import java.util.List;

public class T1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i : candies){
            max = Math.max(max,i);
        }
        List<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                res.add(true);
            } else res.add(false);
        }
        return res;
    }
}
