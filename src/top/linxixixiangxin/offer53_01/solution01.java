package top.linxixixiangxin.offer53_01;

public class solution01 {
}
class Solution53_01_01{
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                count ++;
                continue;
            }
            if(i-1>-1 &&nums[i-1] == target) break;
        }
        return count;
    }
}