package top.linxixixiangxin.offer10_1;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class solution01 {
    public static void main(String[] args) {
       for(int j = 0;j<100;j++){
           System.out.println(new Solution10_01_01().fib(j));
       }
    }
}
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