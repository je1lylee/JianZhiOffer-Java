package top.linxixixiangxin.offer11;

public class solution03 {
    public static void main(String[] args) {
        System.out.println(new Solution11_03().minArray(new int[]{3,1,3}));
    }
}

/**
 * 存在错误
 */
class Solution11_03 {
    public int minArray(int[] numbers) {
        return numbers[0];
    }
}