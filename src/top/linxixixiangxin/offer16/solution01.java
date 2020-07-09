package top.linxixixiangxin.offer16;

public class solution01 {
}

class Solution16_01{
    /**
     * 快速幂大法好
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        boolean test = false;
        if(n < 0) {
            test = true;
        }
        double res = 1;
        double tt = x;
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= tt;
            }
            tt *= tt;
            n /= 2;
        }
        if(test) {
            res = 1/res;
        }
        return res;
    }
}