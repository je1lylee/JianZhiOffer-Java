package top.linxixixiangxin.dp.lc300;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution300_01().lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }
}
class Solution300_01 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans = 1;
        for (int i = 1;i<nums.length;i++){
            int max  =0;
            for (int j = 0;j<i;j++){
                if (nums[i] > nums[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max + 1;
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        return ans;
    }
}