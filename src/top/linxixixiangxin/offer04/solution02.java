package top.linxixixiangxin.offer04;

public class solution02 {
    public static void main(String[] args) {
        int[][] testCase = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(new Solution04_02().findNumberIn2DArray(testCase, 22));
    }
}

class Solution04_02 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix[0][0] > target || matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] < target)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] > target)
                --col;
            else ++row;
        }
        return false;
    }
}