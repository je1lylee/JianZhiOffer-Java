package top.linxixixiangxin.offer29;

public class solution02 {
    public static void main(String[] args) {
        int[] ints = new Solution29_02().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

    }
}

class Solution29_02 {
    public int[] spiralOrder(int[][] matrix) {
        //处理特殊输入
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        //得到矩阵的行数 列数
        int rows = matrix.length, columns = matrix[0].length;
        //存储已经访问过的元素
        boolean[][] visited = new boolean[rows][columns];
        //总元素数量 用来输出结果
        int total = rows * columns;
        int[] order = new int[total];
        //当前元素的坐标
        int row = 0, column = 0;
        int[][] directions = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        int directionIndex = 0;
        //遍历所有元素
        for (int i = 0; i < total; i++) {
            //填入元素
            order[i] = matrix[row][column];
            //将对应位置设置为true 代表已经访问过
            visited[row][column] = true;
            //指定下一行    行数 + 方向       [方向序号]       [0]，指定下一列     列序号 + 方向[方向序号][1]
            int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
            // 下一行<0      || 下一行 >=总行数    || 下一列<0        || 下一列 >= 总列数        || 下一个元素已经被访问过
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]) {
                //转换方向
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }
}