package top.linxixixiangxin.offer13;

import java.util.LinkedList;
import java.util.Queue;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution13_02().movingCount(2,3,1));
    }
}
class Solution13_02 {
    public int movingCount(int m, int n, int k) {
        //创建一个辅助矩阵
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        //创建一个队列
        Queue<int[]> queue= new LinkedList<int[]>();
        //将机器人初始点存入队列
        queue.add(new int[] { 0, 0, 0, 0 });
        //如果队列为空代表迭代完毕
        while(queue.size() > 0) {
            //出队进行处理
            int[] x = queue.poll();
            //将数组中的元素取出，并进行相应的处理
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            //此处和DFS相似，但是DFS中是返回0，此处跳过此次循环即可
            if(i >= m || j >= n || k < si + sj || visited[i][j]) {
                continue;
            }
            //将矩阵中对应的元素设置为true
            visited[i][j] = true;
            res ++;
            //将当前元素的下方，右方单元格的索引、数位和加入队列
            queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
        }
        return res;
    }
}