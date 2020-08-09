package top.linxixixiangxin;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(fuc(1,5,new Integer[]{30,60,5,15,30}));
    }
//    public static int fuc(long[] array){
//        int count = 0;
//        if(array.length != 0){
//            for (long i : array) {
//                if(i<2){
//                    continue;
//                }else if(i == 2){
//                    count++;
//                }else{
//                    count += i/2;
//                }
//            }
//        }
//        return count;
//    }
    public static int fuc(int T,int n,Integer[] a){
        //以5举例，此时还剩下1 分配1
        n -=  (n/2) * 2;
        //刚好分配完 不用扔
        if(n == 0) return 0;
        Arrays.sort(a,Collections.reverseOrder());
        int lastOK = 0;
        int cur = 0;
        for(int i = 1;i<a.length;i++){
            if(cur == 0){
                cur = a[i];
            }else{
            }
        }
        return 0;
    }
}