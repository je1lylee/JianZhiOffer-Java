package top.linxixixiangxin.other.kuaishou2020.bingdujiance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        String library = sc.next();
        long res= 0;
        for(int i = 0; i < library.length(); i++){
            for (int j = i+1; j<=library.length(); j++){
                String s = library.substring(i,j);
                if (s.length()<k) continue;
                int count = 0;
                for (int p = 0;p<s.length();p++){
                    if(s.charAt(p) == '1') count++;
                }
                if (count == k){
                    res+=1;
                }

            }
        }
        System.out.println(res);
    }
}
