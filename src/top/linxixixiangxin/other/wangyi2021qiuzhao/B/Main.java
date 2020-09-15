package top.linxixixiangxin.other.wangyi2021qiuzhao.B;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> Map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (Map.containsKey(c)){
                Map.replace(c,Map.get(c) + 1);
            }else{
                Map.put(c,1);
            }

            if(Map.get(c) % 2 == 0){
                Math.max(maxLength,i-start);
            }else{
                start = i;
            }
        }
    }
}
