package top.linxixixiangxin.offer22;

public class solution01 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        ListNode res = new Solution22_01().getKthFromEnd(a,2);
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
class Solution22_01 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return  null;
        }
        int lengthOfLinkedList = 0;
        ListNode tempHead = head;
        while (tempHead != null){
            lengthOfLinkedList ++;
            tempHead = tempHead.next;
        }
        if(lengthOfLinkedList <= k){
            return head;
        }else{
            for(int i = 0;i<lengthOfLinkedList - k;i++){
                head = head.next;
            }
            return head;
        }
    }
}