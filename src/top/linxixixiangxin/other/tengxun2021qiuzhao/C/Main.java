package top.linxixixiangxin.other.tengxun2021qiuzhao.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0;i<T;i++){
            int n = sc.nextInt();
            int digit = 1;
            int A = 0,B = 0;
            int temp = n%(digit*10) + digit*10;
            n -= temp;
            A +=9;B+=temp-9;


        }
    }
}
