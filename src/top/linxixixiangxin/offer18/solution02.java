package top.linxixixiangxin.offer18;

public class solution02 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode dier = new ListNode(4);
        ListNode disan = new ListNode(5);
        head.next = dier;
        dier.next = disan;
        ListNode test = new Solution18_02().deleteNode(head,4);
        while (test != null){
            System.out.println(test.val);
            test = test.next;
        }
    }
}
class Solution18_02 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
        ListNode before = head;
        ListNode now = head.next;
        while (now != null){
            if(now.val == val){
                before.next = now.next;
                break;
            }
            before = now;
            now = now.next;
        }
        return head;
    }
}
