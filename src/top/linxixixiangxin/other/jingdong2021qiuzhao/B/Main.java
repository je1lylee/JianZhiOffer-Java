package top.linxixixiangxin.other.jingdong2021qiuzhao.B;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//三角层数
        int maxIndexOfFloor = 2;
        int curIndex = 1;
        int res = sc.nextInt();
        Queue<Integer> curIndexs = new LinkedList<>();
        Queue<Integer> maxNumbers = new LinkedList<>();
        for(int i  = 1;i<n;i++){
            int[] floor = new int[maxIndexOfFloor + 1];
            for (int j = 0;j<=maxIndexOfFloor;j++){
                floor[j] = sc.nextInt();
            }
            int tempIndex = maxIndexOfFloor-curIndex;
            Integer max = Integer.valueOf(floor[maxIndexOfFloor-curIndex]);
            if(floor[maxIndexOfFloor-curIndex -1] >= max){
                max = Integer.valueOf(floor[maxIndexOfFloor-curIndex -1]);
                tempIndex = maxIndexOfFloor-curIndex-1;
                if(floor[maxIndexOfFloor-curIndex -1] == max){
                    curIndexs.add(tempIndex);
                }
            }
            if (floor[maxIndexOfFloor-curIndex + 1] > max){
                max = Integer.valueOf(floor[maxIndexOfFloor-curIndex + 1]);
                tempIndex = maxIndexOfFloor-curIndex + 1;
            }
            curIndex = tempIndex + 1;
            res += max;
            max  = 0;maxIndexOfFloor += 2;

        }
        System.out.println(res);

    }
}
