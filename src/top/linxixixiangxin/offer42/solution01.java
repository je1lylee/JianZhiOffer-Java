package top.linxixixiangxin.offer42;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution42_01().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
class Solution42_01 {
    //动态规划
    public int maxSubArray(int[] nums) {
        //初始状态 以nums[0]结尾的连续子数组最大和为nums[0]
        int res = nums[0];
        //遍历整个序列
        for(int i = 1; i < nums.length; i++) {
            //如果dp[i-1]<=说明dp[i-1]对dp[i]产生负贡献，即dp[i-1]+nums[i]还不如nums[i]大
            nums[i] += Math.max(nums[i - 1], 0);
            //当dp[i-1]>0时 dp[i] = dp[i-1]+nums[i]
            //当dp[i-1]<=0时，执行dp[i] = nums[i]
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}