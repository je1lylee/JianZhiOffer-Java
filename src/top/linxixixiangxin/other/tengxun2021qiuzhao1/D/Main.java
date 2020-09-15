package top.linxixixiangxin.other.tengxun2021qiuzhao1.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] temp = new Long[n];
        ArrayList<Long> magic = new ArrayList<>();
        for (int i = 0;i<n;i++){
            Long tempx = sc.nextLong();
            magic.add(tempx);
            temp[i] = tempx;
        }
        Comparator<Long> comparator = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o1-o2);
            }

        };
        magic.sort(comparator);
        System.out.println(magic.toString());
        for(int i = 0;i<n;i++){
            int index = magic.indexOf(temp[i]);
            Long num = magic.get(index);
            magic.remove(index);
            System.out.println(magic.get((n-1)/2) + " ");
            magic.add(index,num);
        }
    }
}
