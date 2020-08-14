package top.linxixixiangxin;

import java.util.*;

public class TestClass {
    static int n, ans, sum;
    static int[] a = new int[100000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //读入测试数据条数
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            //读入物品个数
            n = sc.nextInt();
            //所有商品总价格
            sum = 0;
            //读入每个商品的价格，并计算商品总价值
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                sum += a[j];
            }
            ans = sum;
            //开始dfs
            dfs(0, 0, 0);
            System.out.println(ans);
        }
    }

    public static void dfs(int op, int x, int y) {
        if (op >= n) {
            System.out.println("op = " + op + "x = " + x + "y = " + y);
            if (x == y) ans = Math.min(ans, sum - x - y);
            return;

        }
        dfs(op + 1, x + a[op], y);
        dfs(op + 1, x, y + a[op]);
        dfs(op + 1, x, y);
    }
}