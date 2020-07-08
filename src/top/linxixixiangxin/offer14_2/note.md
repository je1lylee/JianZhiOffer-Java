## [剑指 Offer 14- II. 剪绳子 II](https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/)

#### 解法1

​		直接在上一道题目的基础上，使用BigDecimal类改造贪心即可。

````java
class Solution14_02_01 {
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
            BigDecimal result = BigDecimal.valueOf(3).pow(timesOf3).multiply(BigDecimal.valueOf(2).pow(timesOf2));
            return (int) Integer.parseInt(result.divideAndRemainder(BigDecimal.valueOf(1000000007))[1].toString());
        }
    }
}
````

#### 解法2

​		使用贪心+非递归快速幂继续优化算法。

什么是快速幂？（https://zhuanlan.zhihu.com/p/95902286）

> **方法1：**最朴素的想法，7*7=49，49*7=343，... 一步一步算，共进行了**9次**乘法。
>
> 这样算无疑太慢了，尤其对计算机的CPU而言，每次运算只乘上一个个位数，无疑太屈才了。这时我们想到，也许可以拆分问题。
>
> **方法2：**先算7的5次方，即7*7*7*7*7，再算它的平方，共进行了**5次**乘法。
>
> 但这并不是最优解，因为对于“7的5次方”，我们仍然可以拆分问题。
>
> **方法3：**先算7*7得49，则7的5次方为49*49*7，再算它的平方，共进行了**4次**乘法。
>
> 模仿这样的过程，我们得到一个在`O(log n)`时间内计算出幂的算法，也就是快速幂。

````java
class Solution14_02_02 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 2) {
            return (int) (quickPow(3, a) * b % 1000000007);
        } else {
            return (int) ((quickPow(3, a - 1) * (b + 3)) % 1000000007);
        }
    }

    /**
     * 非递归快速幂
     * @param x 底数
     * @param n 幂
     * @return
     */
    private long quickPow(int x, long n) {
        long res = 1;
        long tt = x;
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= tt;
                res %= 1000000007;
            }
            tt *= tt;
            tt %= 1000000007;
            n /= 2;
        }
        return res;
    }
}
````

