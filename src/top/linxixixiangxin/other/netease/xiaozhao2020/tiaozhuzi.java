package top.linxixixiangxin.other.netease.xiaozhao2020;

import java.util.Scanner;

public class tiaozhuzi {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        for (int t = 0; t < 1; t++) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            long[] h = new long[1000];
            int n = 5;int k = 3;
            long[] h = {6,2,4,3,8};
//            for (int N = 0; N < n; N++) {
//                h[N] = sc.nextLong();
//            }
            //n相当于h.length
            function(h,k,n);
        }
    }
    static void function(long[] h,int k,int n){
        //当前遍历到的索引
        int i = 0;
        while (i<n){
            System.out.println(h[i]);
            i++;
        }
    }
}
