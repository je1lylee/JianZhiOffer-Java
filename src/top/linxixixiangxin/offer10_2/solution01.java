package top.linxixixiangxin.offer10_2;

import java.math.BigDecimal;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution10_02_01().numWays(23));
    }
}

/**
 * 利用排列数得到结果
 */
class Solution10_02_01 {
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