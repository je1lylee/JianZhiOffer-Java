package top.linxixixiangxin.offer11;

import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution11_01().minArray(new int[]{3, 4, 5, 1, 2}));
    }
}

/**
 * 排序法
 */
class Solution11_01 {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        Arrays.sort(numbers);
        return numbers[0];
    }
}