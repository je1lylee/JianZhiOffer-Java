package top.linxixixiangxin.other.jingdong2017qiuzhao.jinzhijunzhi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            //目标数字
            int A = sc.nextInt();
            long sum = 0;
            for(int i=  2;i<=A-1;i++){
                sum += fun(A,i);
            }
            System.out.println(giveMeAns(sum,A-2));
        }
    }

    /**
     * 进制转换-number会被先取模system再除以system
     * @param number 原始数字
     * @param system 进制
     */
    static long fun(int number,int system){
        //表示的是各位数之和
        long digitSum = 0;
        //number还没有被除完
        while (number > 0){
            digitSum += number%system;
            number /= system;
        }
        return digitSum;
    }
    static String giveMeAns(long top,int bottom){
        while (true){
            if(top%2 == 0 && bottom%2 == 0){
                top/=2;bottom/=2;
            }else if(top%3 == 0 && bottom %3 ==0){
                top/=3;bottom/=3;
            }else{
                break;
            }
        }
        return top+"/"+bottom;
    }
}
