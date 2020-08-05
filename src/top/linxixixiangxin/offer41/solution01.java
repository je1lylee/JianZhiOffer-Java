package top.linxixixiangxin.offer41;

import java.util.*;

public class solution01 {
    public static void main(String[] args) {
        MedianFinder41_01 m = new MedianFinder41_01();
        m.addNum(5);
        m.addNum(8);
        System.out.println(m.findMedian());
        m.addNum(2);
        System.out.println(m.findMedian());
    }
}
//未完成
class MedianFinder41_01 {
List<Integer> bucket = new ArrayList<>();
    /** initialize your data structure here. */
//    public MedianFinder41_01() {
//      使用自动生成的无参构造器
//    }

    public void addNum(int num) {
        bucket.add(num);
    }

    public double findMedian() {
        int size = bucket.size();
        if (size == 0) return 0;
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        bucket.sort(comparator);
        //偶数 两个中位数取平均值
        if(size % 2 ==0){
            size = size/2;
            return Double.valueOf(((double)bucket.get(size) + (double)bucket.get(size-1))/2);
        }else{
            //奇数直接取中间值即可
            return bucket.get(size/2);
        }
    }
}
