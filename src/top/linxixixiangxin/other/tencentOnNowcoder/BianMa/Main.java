package top.linxixixiangxin.other.tencentOnNowcoder.BianMa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        //用curSum来保存已有计算结果
        //sum计算4种情况之和
        int sum = 0,curSum = 0;
        //遍历数组
        for(int i = 0; i < 4; ++i){
            curSum *= 25;
            if (i < n) {
                curSum += s[i] - 'a';
            }
            sum += curSum;
            if (i < n - 1) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
