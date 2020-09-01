package top.linxixixiangxin.dp.lc474;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution474_01().findMaxForm(new String[]{"10","0001","111001","1","0"},5,3));
    }
}
//？
class Solution474_01 {
    public int findMaxForm(String[] strs, int m, int n) {
        //开一个数组 用来存储状态
        int[][] dp = new int[m + 1][n + 1];
        //遍历数组
        for (String s : strs) {
            //计算字符串中存在多少个0/1
            int[] count = countzeroesones(s);
            //处理数字0
            for (int zeroes = m; zeroes >= count[0]; zeroes--) {
                //处理数字1
                for (int ones = n; ones >= count[1]; ones--) {
                    dp[zeroes][ones] =
                            Math.max(
                                    1 + dp[zeroes - count[0]][ones - count[1]],
                                    dp[zeroes][ones]
                            );
                }
            }

        }
        return dp[m][n];
    }

    public int[] countzeroesones(String s) {
        int[] c = new int[2];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - '0']++;
        }
        return c;
    }
}