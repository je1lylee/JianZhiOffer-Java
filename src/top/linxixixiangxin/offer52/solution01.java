package top.linxixixiangxin.offer52;

import top.linxixixiangxin.ListNode;

public class solution01 {
    public static void main(String[] args) {

    }
}
class Solution52_01{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode node1=headA;
        ListNode node2=headB;
        while (node1!=node2){
            node1=(node1==null)?headB:node1.next;
            node2=(node2==null)?headA:node2.next;
        }
        return node1;
    }
}