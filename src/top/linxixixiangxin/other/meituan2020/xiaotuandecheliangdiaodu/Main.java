package top.linxixixiangxin.other.meituan2020.xiaotuandecheliangdiaodu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int money = 0;
        ArrayList<Integer[]> cars = new ArrayList<>();
        //读入了所有的数据
        for (int i = 0;i<n;i++){
            Integer[] temp = new Integer[2];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
        }
        while (a != 0 && b != 0){
            int aBig = 0;
            int aIndex = 0;
            int bBig = 0;
            int bIndex= 0;
            for (int i = 0;i<cars.size();i++) {
                int x = cars.get(i)[0];
                int y = cars.get(i)[1];
                if(x > aBig){
                    aBig = x;
                    aIndex = i;
                }
                if (y > bBig){
                    bBig = y;
                    bIndex = y;
                }
            }
            if (aIndex == bIndex){
                if (aBig > bBig && a!=0){
                    a--;
                    money += aBig;

                }else{
                    b--;
                    money += b;
                }
                cars.remove(aIndex);
            }else{
                a--;money += aBig;
                b--;money += b;
                cars.remove(aIndex);
                cars.remove(bIndex);
            }
            aBig = 0;
            bBig= 0;
            aIndex = 0;
            bIndex = 0;

        }
        System.out.println(money);
    }
}
