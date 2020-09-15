package top.linxixixiangxin.other.tencentOnNowcoder.SuShuDui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 3;i<(n/2)+1;i++){
//            System.out.println(i);
            if (testIsPrime3(i) && testIsPrime3(n-i)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean testIsPrime3(int n){
        if (n <= 3) {
            return n > 1;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
