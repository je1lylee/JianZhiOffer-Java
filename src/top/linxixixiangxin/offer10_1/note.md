## [剑指 Offer 10- I. 斐波那契数列](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)

解法1

​		按照斐波那契的公式推导即可。

````java
class Solution10_01_01 {
    public int fib(int n) {
        ArrayList<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.valueOf(0));
        list.add(BigDecimal.valueOf(1));
        for(int i = 1;i<=n;i++){
            list.add(list.get(i).add(list.get(i-1)));
        }
        BigDecimal[] result = list.get(n).divideAndRemainder(BigDecimal.valueOf(1000000007));
        return Integer.parseInt(String.valueOf(result[1]));
    }
}
````

