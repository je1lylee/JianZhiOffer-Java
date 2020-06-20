package top.linxixixiangxin.offer03;

import java.util.Arrays;

public class solution01 {
    public static void main(String[] args){
        System.out.println(new Solution03_01().findRepeatNumber(new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }
}

class Solution03_01 {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) return nums[i];
            }
        }
        return 0;
    }
}

