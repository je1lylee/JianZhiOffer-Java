package top.linxixixiangxin.offer14_1;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution14_01_02().cuttingRope(10));
    }
}
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