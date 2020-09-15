package top.linxixixiangxin.offer53_02;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution53_02_01().missingNumber(new int[]{0}));
    }
}

class Solution53_02_01{
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int i = 0;
        for(i = 0;i<nums.length;i++){
            if (nums[i] != i) return i;
        }
        return i;
    }
}