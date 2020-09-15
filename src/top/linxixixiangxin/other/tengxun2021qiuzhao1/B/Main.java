package top.linxixixiangxin.other.tengxun2021qiuzhao1.B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//have n people
        int m = sc.nextInt();//have m teams
        int[][] table = new int[m][];
        boolean[] canKnow = new boolean[m];
        //读入数据的同时 找到含0的小组
        Set<Integer> magic = new HashSet<>();
        for(int i = 0;i<m;i++){
            int count = sc.nextInt();
            int[] teams = new int[count];
            for(int j = 0;j<count;j++){
                teams[j] = sc.nextInt();
                if(teams[j] == 0){
                    canKnow[i] = true;
                }
            }
            if(canKnow[i]){
                for (int team : teams) {
                    magic.add(team);
                }
            }else{
                table[i] = teams;
            }
        }
        for(int i = 0;i<m;i++){
            if(!canKnow[i]){
                for (int i1 : table[i]) {
                    if(magic.contains(i1)){
                        canKnow[i] = true;
                        for (int i2 : table[i]) {
                            magic.add(i2);
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(magic.size());
    }
}
