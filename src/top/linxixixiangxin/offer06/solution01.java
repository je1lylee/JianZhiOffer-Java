package top.linxixixiangxin.offer06;

import java.util.ArrayList;
import java.util.Arrays;

public class solution01 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        int[] sout = new Solution06_01().reversePrint(a);
        for(int item:sout){
            System.out.println(item);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution06_01 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        while (head != null){
            res.add(head.val);
            head = head.next;
        }
        int[] resT = new int[res.size()];
        //1ms 40.4MB
        int pointer = 0;
        for (int i = res.size()-1;i>=0;i--){
            resT[pointer] = res.get(i);
            pointer++;
        }
        //2ms 40.3ms
//        for(int i = 0;i<res.size();i++){
//            resT[i] = res.get(res.size()-i-1);
//        }
        return resT;
    }
}