##　[剑指 Offer 17. 打印从1到最大的n位数](https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/)

#### 解法1

​		找到数学规律即可求解

````java
class Solution17_01 {
    public int[] printNumbers(int n) {
        int maxNum = (int)Math.pow(10,n) - 1;
        int[] res = new int[maxNum];
        for(int i = 0;i<maxNum;i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
````

