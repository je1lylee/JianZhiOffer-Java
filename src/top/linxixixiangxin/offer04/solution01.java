package top.linxixixiangxin.offer04;

public class solution01 {
    public static void main(String[] args) {
        int[][] testCase = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(new Solution04_01().findNumberIn2DArray(testCase, 20));
    }
}

class Solution04_01 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //判断矩阵长度为0 矩阵第一行长度为0 判断左上角是不是比target大 判断右下角是不是比target小（是不是在矩阵的范围内）
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0][0] > target || matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] < target)
            return false;
        //扫描矩阵的行
        for (int[] ints : matrix) {
            //如果行的第一个元素比target小 就扫描整行 如果比target大 则说明剩下的元素也比target大 就退出循环
            if (ints[0] <= target) {
                for (int anInt : ints) {
                    if (anInt == target) return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}