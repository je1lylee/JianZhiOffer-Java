package top.linxixixiangxin.offer15;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution15_01().hammingWeight(00000000000000000000000000001011));
    }
}
class Solution15_01 {
    public int hammingWeight(int n) {
        int count = 0;
        //遍历判断
        while (n !=0){
            //最右一位为0时n&1=0，最右一位为1时n&1=1，
            count += n&1;
            //右移一位
            n = n >>>1;
        }
        return count;
    }
}