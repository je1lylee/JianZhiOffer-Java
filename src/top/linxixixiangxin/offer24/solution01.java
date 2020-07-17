package top.linxixixiangxin.offer24;

import java.awt.*;

public class solution01 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode res = new Solution24_01().reverseList(a);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
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
class Solution24_01 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null){
            //当前节点的下一个节点
            temp = cur.next;
            //当前节点指向pre
            cur.next = pre;
            //pre cur前进一位
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}