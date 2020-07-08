package top.linxixixiangxin.offer15;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution15_02().hammingWeight(00000000000000000000000000001011));
    }
}
class Solution15_02 {
    public int hammingWeight(int n) {
        int count = 0;
        //遍历判断
        while (n !=0){
            count ++;
            n = n&(n -1);
        }
        return count;
    }
}