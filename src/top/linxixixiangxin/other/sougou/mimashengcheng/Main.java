package top.linxixixiangxin.other.sougou.mimashengcheng;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //槽位个数（数组长
        int M = sc.nextInt();
        //计算轮数
        int N = sc.nextInt();
        //待加密序列
        int[] code = new int[M];
        //进行N轮计算
        for(int i = 0;i<N;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
//            for(int k = start;k<=end;k++){
//                code[k] = i+1;
//            }
            Arrays.fill(code,start,end+1,i+1);
        }
        long passWord = 0;
        for(int i = 0;i<M;i++){
            passWord += code[i]*i;
        }
        System.out.print((int)passWord%100000009);
    }
}
