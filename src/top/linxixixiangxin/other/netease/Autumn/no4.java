package top.linxixixiangxin.other.netease.Autumn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 现在有n个物品，每个物品都有一个价值，现在想将这些物品分给两个人，
 * 要求这两个人分到的物品价值总和相同(个数可以不同，总价值相同即可)，
 * 剩下的物品就要扔掉，现在想知道最少需要扔多少价值的物品才能满足要求分给两个人。
 *
 * 输入描述
 * 第一行输入一个整数T，代表有T组测试数据
 * 对于每一组测试数据，一行输入一个整数n，代表物品的个数
 * 接下来n个数，a[i]代表每一个物品的价值
 * 1 <= T <= 10
 * 1 <= n <= 15
 * 1 <= a[i] <= 100000
 * 输出描述
 * 每一行输出最少需要扔掉多少价值的物品
 * 示例1
 * 输入
 * 1
 * 5
 * 30 60 5 15 30
 * 输出
 * 20
 */
public class no4 {
    public static void main(String[] args) {

    }
    static Integer fuc(int n,int[] a){
        //物品的数量是偶数 正好分给两个人
        Arrays.sort(a);
        for (int i = 0;i<n;i++){
            int temp = 0;
            for (int j = n-i;j>0;j--){
                if (temp<=0){
                    temp += a[j];
                }else{
                    temp -=a[j];
                }
                if (temp == 0){

                }
            }
        }
        return 0;
    }
}
