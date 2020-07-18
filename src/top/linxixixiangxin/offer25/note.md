## [剑指 Offer 25. 合并两个排序的链表](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)

#### 解法1

维护两个指针即可，prehead的第一个元素为-1，返回的时候返回prehead节点的next。

````java
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
````

