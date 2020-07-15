package top.linxixixiangxin.offer21;

public class solution01 {
    public static void main(String[] args) {
        int[] nums = new Solution21_01().exchange(new int[]{1, 2, 3, 4});
        for (int num:nums){
            System.out.println(num);
        }
    }
}

class Solution21_01 {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int head = 0, butt = nums.length - 1;
        while (head < butt) {
            if (nums[head] % 2 != 0) {
                //是奇数的话，就不动了
                head++;
                continue;
            } else {
                //是偶数才进入循环
                while (nums[butt] % 2 == 0 && butt != head) {
                    //如果是奇数的话准备交换，否则就继续往前
                    butt--;
                }
                if (butt == head) {
                    break;
                } else {
                    int temp = nums[head];
                    nums[head] = nums[butt];
                    nums[butt] = temp;
                    head++;
                    butt--;
                }
            }
        }
        return nums;
    }
}