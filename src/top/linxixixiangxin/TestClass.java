package top.linxixixiangxin;

import java.lang.reflect.Type;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] test = new Test().divingBoard(9,8436,28489);
        System.out.print("耗时");
        System.out.println(System.currentTimeMillis() - startTime);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
class Test{
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0){
            return new int[0];
        }
        if(shorter == longer){
            return new int[]{shorter * k};
        }
        int[] resultList = new int[k+1];
        for(int i = 0;i <= k;i++){
            resultList[i] = shorter * (k-i) + longer * i;
        }
        return resultList;
    }
}