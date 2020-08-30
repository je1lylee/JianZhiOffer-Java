package top.linxixixiangxin.other.didi2021qiuzhao.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;int y = 0;
        int count =0;
        int[][] kkk = new int[999][2];
        while ( x+y<= 1998 && x + y <= n ){
            for (int i = 1;i<9;i++){
                for (int j = 1;j<9;j++){
                    for (int k = 1;k<9;k++){
                        if((k*2) %10 != n % 10) continue;
                        x = i*100 + j*10 + k;
                        y = i*100 + k *10 + k;
                        if (x+y == n){
                            kkk[count][0] = x;
                            kkk[count][1] = y;
                            count+=1;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        if(count!=0){
            for (int k = 0;k<count;k++) {
                for (int anInt : kkk[k]) {
                    System.out.print(anInt + " ");
                }
                System.out.println("");
            }
        }
    }
}
