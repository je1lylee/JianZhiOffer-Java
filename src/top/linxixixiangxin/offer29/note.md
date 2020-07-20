## [剑指 Offer 29. 顺时针打印矩阵](https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/)

#### 解法1（来自剑指Offer）

> ​		接下来分析循环结束的条件。假设这个矩阵的行数是rows, 列数是columns。打印第-圈的左 上角的坐标是(0, 0),第二圈的左上角的坐标是(1, 1),以此类推。我们注意到，左上角的坐标中行标和列标总是相同的，于是可以在矩阵中选取左上角为(start, start)的一圈作为我们分析的目标。
>
> 对于一个5x5的矩阵而言，最后一圈只有一一个数字， 对应的坐标为(2, 2)。我们发现5>2X2。对于一个6X6的矩阵而言，最后一圈有4个数字，其左上角的坐标仍然为(2, 2)。我们发现6> 2*2依然成立。于是可以得出，让循环继续的条件是columns > startX*2并且rows > startY*2。所以我们可以用如下的循环来打印矩阵。
>
> 接着我们考虑如何打印一圈的功能，即如何实现PrintMatrixInCircle。如图4.4所示，我们可以把打印一-圈分为四步:第一步，从左到右打印一行:第二步，从上到下打印一列:第三步，从右到左打印一行;第四步，从下到上打印列。 每一步我们根据起始坐标 和终止坐标用一个循环就能打印出一行或者一列。不过值得注意的是，最后一图有可能退化成只有一行只有一列，甚至只有一个数字，因此打印这样的南缝不再需要四先。图4.5是几个退化的例子，打印一圈分别只需要三步、两步甚至步。图4.5打印矩阵最里面一圈可能只需要三步、两步甚至一步因此，我们要仔细分析打印时每一步的前提条件。 第步总是需要的，因为打印一圈至少有一一步。如果只有一行，那就不用第二步了。也就是需要第二步的前提条件是终止行号大于起始行号。需要第三步打印的前提条件是圈内至少有两行两列，也就是说，除了要求终止行号大于起始行号，还要求终止列号大于起始列号。同理，需要打印第四步的前提条件是至少有三行两列，因此要求终止行号比起始行号至少大2,同时终止列号大于起始列号。

````java
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
````

