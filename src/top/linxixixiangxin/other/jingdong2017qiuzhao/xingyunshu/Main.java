package top.linxixixiangxin.other.jingdong2017qiuzhao.xingyunshu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++){
            if (get1Times(Integer.toBinaryString(i)).equals(getTenDigitSum(i))){
                sum++;
            }
        }
        System.out.println(sum);

    }
    static String getTenDigitSum(int num){
        int sum = 0;
        while (num != 0){
            sum += num%10;
            num /= 10;
        }
        return String.valueOf(sum);
    }
    static String get1Times(String s){
        int times = 0;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) == '1'){
                times++;
            }
        }
        return String.valueOf(times);
    }
}
