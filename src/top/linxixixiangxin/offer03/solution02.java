package top.linxixixiangxin.offer03;

import java.util.Arrays;

public class solution02 {
    public static void main(String[] args){
        System.out.println(new Solution01_02().findRepeatNumber(new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }
}
class Solution01_02 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == nums[i+1]) return nums[i];
        }
        return 0;
    }
}
