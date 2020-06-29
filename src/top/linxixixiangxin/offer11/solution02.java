package top.linxixixiangxin.offer11;

import java.util.Arrays;

public class solution02 {
    public static void main(String[] args) {
        System.out.println(new Solution11_02().minArray(new int[]{1,3,5}));
    }
}
class Solution11_02 {
    public int minArray(int[] numbers) {
        if(numbers.length == 1){
            return numbers[0];
        }
        for(int i = 1;i<numbers.length;i++){
            System.out.println("numbers[i] = " + numbers[i]);
            System.out.println("numbers[i-1] = " + numbers[i - 1]);
            if (numbers[i] < numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}