package top.linxixixiangxin.offer11;

public class solution03 {
    public static void main(String[] args) {
        System.out.println(new Solution11_03().minArray(new int[]{3,1,3}));
    }
}


class Solution11_03 {
    public int minArray(int[] numbers) {
        //初始化两个“指针”，用来指示窗口的位置
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            //取数组中间的元素
            int m = (i + j) / 2;
            //中间的元素比最后的元素大，将i指针后移
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                //将指针前移
                j = m;
            } else {
                //让两个指针指向同一个元素
                j--;
            }
        }
        return numbers[i];
    }
}