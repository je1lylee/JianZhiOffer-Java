package top.linxixixiangxin.offer29;

import java.util.ArrayList;
import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        int[] ints = new Solution29_01().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}

class Solution29_01 {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int[] spiralOrder(int[][] matrix) {
        //处理特殊输入
        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        } else {
            int start = 0;
            //行 列
            int row = matrix.length;
            int col = matrix[0].length;
            while (col>start *2 && row>start *2){
                printInCircle(matrix, col, row, start);
                ++start;
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
            //输出数组 用于测试
            System.out.println(res[i]);
        }
        return res;
    }

    public void printInCircle(int[][] matrix, int col, int row, int start) {
        int endX = col - 1 - start;
        int endY = row - 1 - start;
        for (int i = start; i <= endX; ++i) {
            arrayList.add(matrix[start][i]);
        }
        if (start < endY) {
            for (int i = start + 1; i <= endY; ++i) {
                arrayList.add(matrix[i][endX]);
            }
        }
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; --i) {
                arrayList.add(matrix[endY][i]);
            }
        }
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; --i) {
                arrayList.add(matrix[i][start]);
            }
        }
    }
}