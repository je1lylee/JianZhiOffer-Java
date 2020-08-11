package top.linxixixiangxin.offer44;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution44_01().findNthDigit(113));
    }
}
class Solution44_01 {
    public int findNthDigit(int n) {
        //位数
        int digit = 1;
        //起始数字
        long start = 1;
        //数位数量
        long count = 9;
        //确定n所在数字的位数
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        //确定n所在的数字
        long num = start + (n - 1) / digit; // 2.
        //确定n是num中的哪一数位
        //所求数位为数字 num 的第 x(n−1)%digit 位（ 数字的首个数位为第 0 位）
        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
    }
}