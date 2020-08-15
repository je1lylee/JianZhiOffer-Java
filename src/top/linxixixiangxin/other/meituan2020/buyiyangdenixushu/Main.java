package top.linxixixiangxin.other.meituan2020.buyiyangdenixushu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n是不超过n的前提下有多少逆序数
        long n = sc.nextLong();
        long lowerNumber = 2170;
        int targetNumberCount = 0;
        ArrayList<String> res = new ArrayList<>();
        //保证某个数乘以4后还在n的范围区间内
        while (lowerNumber*4 <= n){
            if(isNiXuShu(String.valueOf(lowerNumber),String.valueOf(lowerNumber*4))){
                res.add(String.valueOf(lowerNumber));
                res.add(String.valueOf(lowerNumber*4));
                targetNumberCount++;
            }
            lowerNumber += 1;
        }
        if(targetNumberCount == 0){
            System.out.println(0);
        }else{
            System.out.println(targetNumberCount);
            for(int i = 0;i<res.size();i+=2){
                System.out.printf("%s %s",res.get(i),res.get(i+1));
            }
        }
    }
    static boolean isNiXuShu(String a,String b){
        //两个数字一样才可能互为逆序数
        if(a.length() == b.length()){
            for(int i = 0;i<a.length();i++){
                if(a.charAt(i) != b.charAt(a.length()-1-i)){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
