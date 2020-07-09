package top.linxixixiangxin.offer18;

public class solution01 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode dier = new ListNode(4);
        ListNode disan = new ListNode(5);
        head.next = dier;
        dier.next = disan;
        ListNode test = new Solution18_01().deleteNode(head,4);
        while (test != null){
            System.out.println(test.val);
            test = test.next;
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
class Solution18_01 {
    public ListNode deleteNode(ListNode head, int val) {
        //head节点的值就等于目标值
        if(head.val == val){
            return head.next;
        }
        //创建指针，指向当前处理的对象
        ListNode cur = head;
        //判断当前元素下一个元素是否满足
        while(cur.next != null){
            //满足
            if (cur.next.val == val){
                //下一个元素重新赋值为下下个元素
                cur.next = cur.next.next;
                break;
            }else {
                //指针指向后一个元素
                cur = cur.next;
            }
        }
        return  head;
    }
}
