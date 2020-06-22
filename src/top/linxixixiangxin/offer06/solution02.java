package top.linxixixiangxin.offer06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class solution02 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        int[] sout = new Solution06_02().reversePrint(a);
//        for (int item:sout){
//            System.out.println(item);
//        }
    }
}

class Solution06_02 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> res = new Stack<>();
        while (head != null){
            res.push(head.val);
            head = head.next;
        }
        //因为stack的长度会变化，所以要定义一个。
        int size = res.size();
        int [] resT = new int[size];
        for(int i = 0;i<size;i++){
            resT[i] = res.pop();
        }
        return resT;
    }
}