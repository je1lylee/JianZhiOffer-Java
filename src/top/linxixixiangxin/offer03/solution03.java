package top.linxixixiangxin.offer03;

import java.util.Arrays;

public class solution03 {
    public static void main(String[] args) {
        System.out.println(new Solution03_03().findRepeatNumber(new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }

}

class Solution03_03 {
    public int findRepeatNumber(int[] nums) {
        //扫描整个数组
        for(int i = 0;i<nums.length;i++){
            //如果下标存储的值和下标不相等 就进入循环 开始准备交换
            while (nums[i] != i){
                //如果对应下标的数字重复了 就返回
                if(nums[i] == nums[nums[i]]) return nums[i];
                //如果没有重复 就交换这两个数字 直到nums[i] == i
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }
}