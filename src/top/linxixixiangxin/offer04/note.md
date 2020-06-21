## 剑指 Offer 04. 二维数组中的查找

#### 解法1

​		最简单粗暴的方法就是遍历整个数组，嵌套两个`for`循环即可，这里使用的是其他方法。因为每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。所以可以利用这个特征来处理问题。首先判断数组的左上角是不是比目标数值大，如果大了，说明数组中所有数字都比目标数值大，直接返回`false`。再判断右下角的数字是不是比目标数值小，如果小了，说明数组中所有数字都比目标数值小，直接返回`false`。完成数据范围的判断后开始扫描数组中的每一行，如果这一行的第一个数字比目标数字小，则扫描整行，如果发现相等的数字返回`true`如果没有就进行下一行的循环。如果这一行的第一个数字比目标数字大，则退出循环并返回`false`。

```java
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
```

#### 解法2（书上的解法)		

​		首先选取数组中右上角的数字。如果该数字等于要查找的数字，则查找过程结束：如果该数字大于要查找的数字，则剔除这个数字所在的列；如果该数字小于要查找的数字，则剔除这个数字所在的行。也就是说如果要查找的数字不在数组的右上角，则每一个都在数组的查找范围中剔除一行或者一列。这样每一步都可以缩小查找的范围，直到找到要查找的数字。或者查找范围为空。

````java
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
````

