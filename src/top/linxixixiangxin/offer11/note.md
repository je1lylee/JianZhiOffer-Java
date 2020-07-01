## [剑指 Offer 11. 旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

#### 解法1

​		排序后取下标为0的元素。

````java
class Solution11_01 {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        Arrays.sort(numbers);
        return numbers[0];
    }
}
````

#### 解法2

​		依次遍历数组中所有元素，遇到当前元素比前一个元素小的时候就返回当前下边对应的值，否则返回下标为0的元素。

````java
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
````

#### 解法3

​		题解请移步[Leet-code题解](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/mian-shi-ti-11-xuan-zhuan-shu-zu-de-zui-xiao-shu-3/)。

````java
class Solution11_03 {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
````



