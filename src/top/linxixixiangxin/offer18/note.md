## [剑指 Offer 18. 删除链表的节点](https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/)

#### 解法1

​		使用单指针完成。

````java
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

````

#### 解法2

​		使用双指针，一个指针指向当前元素，另一个指针指向当前元素的上一个元素。

````java
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
````



