package top.linxixixiangxin.offer14_2;

import java.math.BigDecimal;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution14_02_01().cuttingRope(10));
    }
}
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