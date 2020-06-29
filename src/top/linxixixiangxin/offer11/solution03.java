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
        if(numbers.length == 1){
            return numbers[0];
        }
        //取中间
        int middle = numbers.length/2;
        //遍历后半部分
        if(numbers[middle] >numbers[numbers.length-1]){
            for(int i = middle;i<numbers.length;i++){
                System.out.println("numbers[i] = " + numbers[i]);
                System.out.println("numbers[i-1] = " + numbers[i - 1]);
                if (numbers[i] < numbers[i-1]){
                    return numbers[i];
                }
            }
        }else{
            for(int i = 1;i<middle;i++){
                System.out.println("numbers[i] = " + numbers[i]);
                System.out.println("numbers[i-1] = " + numbers[i - 1]);
                if (numbers[i] < numbers[i-1]){
                    return numbers[i];
                }
            }
        }
        return numbers[0];
    }
}