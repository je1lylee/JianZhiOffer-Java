package top.linxixixiangxin.other.meituan2020.xiaotuandelvxingxianlu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) System.out.println("1");
        boolean isTarvelling = false;
        long tripsCount = 0;
        String startCity = "";
        ArrayList<String[]> citys= new ArrayList<>();
        for(int i=0;i<n;i++){
            //出发
            String a = sc.next();
            //终点
            String b = sc.next();
            //正在旅行中
            String[] temp = new String[2];
            temp[0] =a;
            temp[1] = b;
            citys.add(temp);
        }
        for (String[] city : citys) {
            if (isTarvelling){
                if(startCity.equals(city[1])){
                    tripsCount++;
                    isTarvelling = false;

                }else{
                    //仍然在旅行中
                    isTarvelling = true;
                    continue;
                }
                //没在旅行
            }else{
                isTarvelling = true;
                startCity = city[0];
            }
        }
        System.out.println(tripsCount);
    }
}
