package top.linxixixiangxin.other.netease.xiaozhao2020;

import java.util.Scanner;

public class fanbei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0;t<T;t++){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long p = sc.nextLong();
            long q = sc.nextLong();
            int count = 0;
            while (true){
                if (A+p >= B){
                    count++;break;
                }else {
                    p *= q;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
