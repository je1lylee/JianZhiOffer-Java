package top.linxixixiangxin.other.jingdong2017qiuzhao.jihe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Integer> res = new TreeSet<>();
            for(int i = 0;i<n+m;i++){
                res.add(sc.nextInt());
            }
            for (Integer re : res) {
                System.out.print(re + " ");
            }
            System.out.println("");

        }
    }
}
