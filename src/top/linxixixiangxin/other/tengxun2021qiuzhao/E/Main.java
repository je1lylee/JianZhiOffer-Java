package top.linxixixiangxin.other.tengxun2021qiuzhao.E;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        int loop = sc.nextInt();
        for(int i = 0;i<loop;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int times = 0;
            String cur = target.substring(s,e);
            Stack<Character> temp = new Stack<>();
            for (int m = 0;m<cur.length();m++){
                if (temp.lastElement() == cur.charAt(m)){
                    temp.pop();
                    if (temp.size() == 0) times++;
                }else{
                }
            }

        }
    }
}
