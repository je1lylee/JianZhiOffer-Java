package top.linxixixiangxin.other.meituan2020.xiaotuandepeisongtuandui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<TreeSet<Integer>> temp= new ArrayList<>();
        for (int i = 0;i<m;i++){
            //第一个数
            int a = sc.nextInt();
            //第二个数
            int b = sc.nextInt();
            //数字被添加成功了吗？
            boolean isAdd = false;
            //在每一个set中寻找匹配，如果匹配成功 意味是同一个小区的单子
            for (TreeSet<Integer> integers : temp) {
                if(integers.contains(a) || integers.contains(b)){
                    integers.add(a);integers.add(b);
                    isAdd = true;
                    break;
                }
            }
            //两个数字都没找到匹配 说明是新小区 则创建一个treeset存入list
            if (!isAdd){
                TreeSet<Integer> tempp = new TreeSet<>();
                tempp.add(a);
                tempp.add(b);
                temp.add(tempp);
            }else{
                //恢复
                isAdd = false;
            }
        }
        int minNumber = 0;
        int index = 0;
        ArrayList<TreeSet<Integer>> res= new ArrayList<>();
        while (temp.size() != 0){
            for(int i = 0;i<temp.size();i++){
                TreeSet<Integer> xx = temp.get(i);
                if(xx.first() < minNumber);
                minNumber = xx.first();
                index = i;
            }
            res.add(temp.get(index));
            temp.remove(index);
            minNumber = 0;
        }

        System.out.println(res.size());
        for (int i = res.size()-1;i>=0;i--) {
            TreeSet<Integer> integers = res.get(i);
            StringBuilder god = new StringBuilder();
            for (Integer integer : integers) {
                god.append(integer);
                god.append(" ");
            }
            god.deleteCharAt(god.length()-1);
            System.out.println(god);
        }
    }
}
