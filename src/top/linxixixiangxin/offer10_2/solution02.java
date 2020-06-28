package top.linxixixiangxin.offer10_2;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution10_02_02().numWays(3));
    }
}
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