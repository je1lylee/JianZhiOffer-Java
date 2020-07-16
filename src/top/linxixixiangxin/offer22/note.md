## [剑指 Offer 22. 链表中倒数第k个节点](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)

#### 解法1

  使用两个循环，第一个循环来遍历得到链表的长度，第二个长度来找到多余的节点并切割掉。

````java
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
````

