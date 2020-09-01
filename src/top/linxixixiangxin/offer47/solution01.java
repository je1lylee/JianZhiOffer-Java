package top.linxixixiangxin.offer47;

import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new solution47_01().maxValue(
                new int[][]{
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}
                }));
    }
}
class solution47_01{
        public int maxValue(int[][] grid) {
            //行数 列数
            int m = grid.length, n = grid[0].length;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 && j == 0) {
                        continue;
                    }
                    if(i == 0) {
                        grid[i][j] += grid[i][j - 1] ;
                    } else if(j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                    }
                }
            }
            return grid[m - 1][n - 1];
        }
}