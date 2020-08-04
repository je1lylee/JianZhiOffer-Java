package top.linxixixiangxin.offer40;

import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution40_01().getLeastNumbers(new int[]{3, 2, 1}, 2)));
    }
}
class Solution40_01 {
    public int[] getLeastNumbers(int[] arr, int k) {
        //抖机灵解法。。
        Arrays.sort(arr);
        return Arrays.copyOf(arr,k);
    }
}