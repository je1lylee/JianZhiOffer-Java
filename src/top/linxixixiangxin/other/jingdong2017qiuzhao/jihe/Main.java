package top.linxixixiangxin.other.jingdong2017qiuzhao.jihe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Integer> res = new TreeSet<>();
            for(int i = 0;i<n+m;i++){
                res.add(sc.nextInt());
            }
            StringBuilder sb  = new StringBuilder();
            for (Integer re : res) {
                sb.append(re + " ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
            break;
        }
    }
}
