package Hot100;

/**
 * @Author htt
 * @Date 2025/2/15
 */
public class T53 {
    // 动态规划
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int maxRes = dp[0];
        for(int i = 1;i<len;i++){
            if(dp[i -1] > 0){
                dp[i] = dp[i-1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            maxRes = Math.max(maxRes,dp[i]);
        }
        return maxRes;
    }
    // 优化空间
    public int maxSubArray2(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
