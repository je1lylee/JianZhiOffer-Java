## [剑指 Offer 13. 机器人的运动范围](https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/)

#### 解法1

​		使用DFS+递归的方式求解，需要开辟一个大小为`m*n`的辅助矩阵，来存储已经访问过的元素，防止重复计数

````java
class Solution {
    //判断元素是不是已经访问过了
    boolean[][] isVisited;
    public int movingCount(int m, int n, int k) {
        //让机器人原地歇着吧。。
        if(k == 0){
            return 1;
        }
        //初始化数组
        this.isVisited = new boolean[m][n];
        //从[0,0]开始让机器人移动
        return dfs(0,0,m,n,k);
    }

    /**
     * 进行DFS递归
     * @param i x坐标
     * @param j y坐标
     * @param m 行数
     * @param n 列数
     * @param k 限制值
     * @return
     */
    int dfs(int i,int j,int m,int n,int k){
        /**
         * i取值异常
         * i越界
         * j取值异常
         * j越界
         * 坐标之和不满足要求
         */
        if(i<0 || i >m-1 || j<0 || j >n-1 || getSum(i)+getSum(j) > k || isVisited[i][j]){
            return 0;
        }
        isVisited[i][j] = true;
        int nums  = dfs(i+1,j,m,n,k) + dfs(i-1,j,m,n,k) + dfs(i,j+1,m,n,k)+dfs(i,j-1,m,n,k) +1;
        return nums;
    }

    /**
     * 把组成两位数的两个数字加起来
     * @param number
     * @return
     */
    int getSum(int number){
        return (number/10)+(number%10);
    }
}
````

