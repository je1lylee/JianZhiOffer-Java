package top.linxixixiangxin.other.jingdong2021qiuzhao.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;//第某个数字
        String res = "";
        int[] template = {2,3,5};
        if (n <= 12){
            int[] magib = {2,3,5,22,23,25,32,33,35,52,53,55};
            System.out.println(magib[n]);
            return;
        }
        while (n > 1){
            res  = template[n%3] + res;
            n /= 3;
        }
        System.out.println(res);
    }
}
