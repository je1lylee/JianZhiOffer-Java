## [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

#### 解法1

​		使用排列数公式即可得到答案，但是这种方法的开销过大，并不是很好。

````java
/**
 * 利用排列数得到结果
 */
class Solution10_02_02 {
    public int numWays(int n) {
        switch (n){
            case 0:
            case 1:
                return 1;
            default:
                int parkE = 1;
                int activeE = n-1;
                BigDecimal res = BigDecimal.valueOf(1);
                while (activeE > parkE){
                    BigDecimal top = magic(activeE);
                    BigDecimal buttom = magic(parkE).multiply(magic(activeE - parkE));
                    res = res.add(top.divide(buttom));
                    parkE ++;
                    activeE --;
                }
                if(activeE == parkE){
                    res = res.add(BigDecimal.valueOf(1));
                }
                return Integer.parseInt(String.valueOf(res.divideAndRemainder(BigDecimal.valueOf(1000000007))[1]));
        }
    }

    /**
     * 计算阶乘
     * 0的阶乘是1
     * bigger than 0x7fffffffffffffffL(Long.MAX_VALUE)
     * @param n
     * @return
     */
    public BigDecimal magic(int n){
        if(n == 0 || n == 1) {
            return BigDecimal.valueOf(1);
        }
        BigDecimal x = BigDecimal.valueOf(1);
        for(int i = 1;i<=n;i++){
            x = x.multiply(BigDecimal.valueOf(i));
        }
        return x;
    }
}
````

#### 解法2

​		通过分析，`n=1`时有`1`种跳法，`n=2`时有`2`种跳法，`n=3`时有`3`种跳法，发现`f(n)=f(n-1)+f(n-2)`种跳法，恰好是斐波那契数列的规律。

````java
/**
 * 斐波那契
 */
class Solution10_02_02 {
    public int numWays(int n) {
        switch (n){
            case 0:
            case 1:
                return 1;
            default:
               int[] temp = new int[n+1];
               temp[1] = 1;
               temp[2] = 2;
               for(int i = 3;i<=n;i++){
                   temp[i] = temp[i-1] + temp[i-2];
                   temp[i] %= 1000000007;
               }
               return temp[n];
        }
    }
}
````

