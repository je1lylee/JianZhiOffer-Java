## [剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)

#### 解法1

逐位遍历即可，利用&的特点内，最右一位为0时n&1=0，最右一位为1时n&1=1。

````java
class Solution15_01 {
    public int hammingWeight(int n) {
        int count = 0;
        //遍历判断
        while (n !=0){
            //最右一位为0时n&1=0，最右一位为1时n&1=1，
            count += n&1;
            //右移一位
            n = n >>>1;
        }
        return count;
    }
}
````

#### 解法2

通过使用 n&(n-1)继续优化算法。

以n = 10101000为例

第一次循环：

n = 10101000

n-1 = 10100111

n&(n-1) = 10100000

第二次循环

n = 10100000

n-1 = 10011111

n&(n-1) = 10000000

第三次循环

n = 10000000

n-1 = 01111111

n&(n-1) = 00000000

------

此时n = 00000000，结束循环。

````java
class Solution15_02 {
    public int hammingWeight(int n) {
        int count = 0;
        //遍历判断
        while (n !=0){
            count ++;
            n = n&(n -1);
        }
        return count;
    }
}
````

