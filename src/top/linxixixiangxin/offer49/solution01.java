package top.linxixixiangxin.offer49;

import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution49_01().nthUglyNumber(10));
    }
}
class Solution49_01{
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0,b = 0,c = 0;
        for(int i = 1;i<n;i++){
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2,n3),n5);
            if(dp[i] == n2)
                a++;
            if (dp[i] == n3)
                b++;
            if (dp[i] == n5)
                c++;

        }
        return dp[n-1];
    }
}