package top.linxixixiangxin.other.sougou2020qiuzhao.A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution01().getHouses(2,new int[]{-1,4,5,2,10,2}));
    }
}
class Solution01{
    //第一个房子的左侧肯定能建造 最后一个房子的右侧肯定可以建造
    public int getHouses(int t, int[] xa){
        double[] map = new double[xa.length];
        for(int i = 1;i<xa.length;i+=2){
            //左侧边界
            map[i-1] = xa[i-1]-(xa[i]/2);
            //右侧边界
            map[i] = xa[i-1]+(xa[i]/2);
        }
        int buildPlanCount = 2;
        //跳过第一个和最后一个元素 第一个房子左侧 肯定可以 最后一个房子右侧肯定可以
        for (int i = 1;i<xa.length-1;i++){
            //偶数检测左
            System.out.println(map[i]);
            if (i % 2 == 0){
                if(map[i] - map[i-1] > t){
                    buildPlanCount++;
                }else if(map[i] - map[i-1] == t){
                    buildPlanCount++;
                    i++;
                }else{
                    continue;
                }
                //奇数检测右
            }else{
                if(map[i+1] - map[i] > t){
                    buildPlanCount++;
                }else if (map[i+1] - map[i] == t){
                    buildPlanCount++;
                    i++;
                }else{
                    continue;
                }
            }
        }

        return buildPlanCount;
    }
}