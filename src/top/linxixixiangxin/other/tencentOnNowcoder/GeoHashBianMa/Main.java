package top.linxixixiangxin.other.tencentOnNowcoder.GeoHashBianMa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int low = -90, high = 90, mid = 0;
        for (int i = 0; i < 6; i++) {
            if(n >= (low + high) / 2) {
                System.out.print("1");
                low = (low + high) / 2;
            }
            else {
                System.out.print("0");
                high = (low + high) / 2;
            }
        }
    }
}
