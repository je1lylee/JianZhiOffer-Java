package top.linxixixiangxin.offer25;

public class solution01 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode a2 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode c2 = new ListNode(3);
        a2.next = b2;
        b2.next = c2;
        ListNode res = new Solution25_01().mergeTwoLists(a,a2);
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
class Solution25_01 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //哨兵节点
        ListNode prehead = new ListNode(-1);
        //维护的指针
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                //指向的是下一个节点 而不是下一个节点的val
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可 l1 == null ? l2 : l1先执行
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
