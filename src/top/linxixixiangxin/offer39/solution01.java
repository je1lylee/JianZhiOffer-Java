package top.linxixixiangxin.offer39;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution39_01().majorityElement(new int[]{1,2,3,2,2,2,5,4,2}));
    }
}
class Solution39_01 {
    public int majorityElement(int[] nums) {
        //当前投票数字，票数
        int num = -1,votes = 0;
        //遍历原数组
        for (int i : nums) {
            //如果投票数为0 则重新给num赋值
            if(votes == 0){
                num = i;
            }
            //如果投票数不为0，且i==当前值 投票数++ 反之--
            if(i == num){
                votes++;
            }else{
                votes--;
            }
        }
        return num;
    }
}
