## [剑指 Offer 24. 反转链表](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/)

#### 解法1

创建两个指针，分别指向当前元素和当前元素的前一个元素。

````java
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
````

