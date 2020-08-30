package top.linxixixiangxin.other.didi2021qiuzhao.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] feibo = new int[n*n];
        feibo[0] = 1;
        feibo[1] = 1;
        //生成斐波那契数列
        for (int i = 2;i< feibo.length;i++){
            feibo[i] = feibo[i-1]+ feibo[i-2];
        }
        for (int i : feibo) {
            System.out.println(i);
        }
        int[][] res = new int[n][n];

        int feiboIndex = 1;
        int start = 0;
        while (n > start *2){
            int endX = n - 1 - start;
            int endY = n -1 - start;
            //第一行
            for (int i = start;i<=endX;i++){
                res[0][i] = feibo[feibo.length-feiboIndex];
                feiboIndex++;
            }
            if (0 < endY){
                for (int i = start + 1;i<=endY;i++){
                    res[i][endX] = feibo[feibo.length-feiboIndex];
                    feiboIndex ++;
                }
            }
            if(0<endX && 0<endY){
                for (int i = endX-1;i>=start;i--){
                    res[endY][i] = feibo[feibo.length-feiboIndex];
                    feiboIndex++;
                }
            }
            if(0<endX && 0<endY -1){
                for (int i = endY-1;i>=start+1;i--){
                    res[i][0] = feibo[feibo.length-feiboIndex];
                    feiboIndex++;
                }
            }
            start++;
        }
        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
