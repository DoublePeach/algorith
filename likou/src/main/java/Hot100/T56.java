package Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author htt
 * @Date 2025/2/15
 */
public class T56 {
    public int[][] merge(int[][] intervals) {
        // 排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            // ans 为空则直接添加
            if (ans.isEmpty()) {
                ans.add(intervals[i]);
            } else {
                int lastTo = ans.get(ans.size() - 1)[1];
                int from = intervals[i][0], to = intervals[i][1];
                if (lastTo >= from) // 相交则更新 ans 中的 lastTo
                    ans.get(ans.size() - 1)[1] = Math.max(lastTo, to);
                else { // 不相交则添在尾部
                    ans.add(intervals[i]);
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
