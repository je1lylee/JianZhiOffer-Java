## [剑指 Offer 14- I. 剪绳子](https://leetcode-cn.com/problems/jian-sheng-zi-lcof/)

#### 解法1-动态规划（DP）

动态规划的四个特点：

- 求一个问题的最优解；
- 整体问题的最优解是依赖各个子问题的最优解；
- 这些小问题之间还有相互重叠的更小的子问题；
- 从下往上求解问题；

````java
class Solution14_01 {
    public int cuttingRope(int n) {
        //处理特殊数据
        if(n < 2){
            return 0;
        }else if (n == 2){
            return 1;
        }else if(n == 3){
            return 2;
        }else {
            //先将特殊数据存入数组
            Integer[] results = new Integer[n+1];
            results[0] = 0;
            results[1] = 1;
            results[2] = 2;
            results[3] = 3;
            //获得最大值
            Integer max = 0;
            //递增 自下而上解决问题
            for(int i = 4;i<=n;i++){
                //切割绳子 同时根据之前得出的小问题的最优解来解决更大的问题，变切n刀为切1刀
                for(int j = 1;j<=i/2;++j){
                    int result = results[j] * results[i-j];
                    if(max < result) {
                        max = result;
                    }
                    results[i] = max;
                }
            }
            max = results[n];
            return max;
        }
    }
}
````

#### 解法2

​		当n>=5的时候，我们可以证明2(n-2)>n并且3(n-3)>n。也就是说，当绳子剩下的长度大于或等于5的时候，我们就把他剪成长度为3或者2的绳子段。另外当n>=5的时候3(n-3) >= 2(n-2)，因此我么应该尽可能地多剪长度为3的绳子段。

````java
class Solution14_01_02 {
    public int cuttingRope(int n) {
        if(n < 2){
            return 0;
        }else if(n == 2){
            return 1;
        }else if(n == 3){
            return 2;
        }else{
            //以n = 10为例
            //timesOf3 = 3
            int timesOf3 = n /3;
            //10 - 3*3 == 1 TRUE
            if(n - timesOf3 * 3 == 1){
                //timesOf3 = 2
                timesOf3 -=1;
            }
            // timesOf2 = (10 - 2 * 3) /2 = 2;
            int timesOf2 = (n -timesOf3 * 3) /2;
            //3^2 * 2^2 = 9*4 = 36
            return (int)Math.pow(3,timesOf3) * (int)Math.pow(2,timesOf2);
        }
    }
}
````

