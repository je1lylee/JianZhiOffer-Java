package top.linxixixiangxin.offer17;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution17_01().printNumbers(8));
    }
}
class Solution17_01 {
    public int[] printNumbers(int n) {
        int maxNum = (int)Math.pow(10,n) - 1;
        int[] res = new int[maxNum];
        for(int i = 0;i<maxNum;i++) {
            res[i] = i + 1;
        }
        return res;
    }
}