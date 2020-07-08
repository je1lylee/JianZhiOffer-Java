package top.linxixixiangxin.offer14_2;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution14_02_02().cuttingRope(10));
    }
}
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