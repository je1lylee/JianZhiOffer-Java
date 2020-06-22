## [剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

#### 解法1

​		创建一个`ArrayList`用来存储遍历到的数值，因为数组的长度不可变，所以使用`ArrayList`，然后正向遍历整个链表并将拿到的值存储到`ArrayList`，再创建一个长度为`ArrayList.size()`的数组，将`ArrayList`的值反向填入数组，达到从头到尾打印链表的目的。类似辅助栈的解法，但是是用`ArrayList`实现的`Stack`的功能。

````java
class Solution06_01 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        while (head != null){
            res.add(head.val);
            head = head.next;
        }
        int[] resT = new int[res.size()];
        //1ms 40.4MB
        int pointer = 0;
        for (int i = res.size()-1;i>=0;i--){
            resT[pointer] = res.get(i);
            pointer++;
        }
        //2ms 40.3ms
        //for(int i = 0;i<res.size();i++){
        //    resT[i] = res.get(res.size()-i-1);
        //}
        return resT;
    }
}
````

#### 解法2

​		创建一个`Stack`用来存储链表中的数据，先扫描链表并把元素压入栈，然后再依次弹出元素到数组里。

````java
class Solution06_02 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> res = new Stack<>();
        while (head != null){
            res.push(head.val);
            head = head.next;
        }
        //因为stack的长度会变化，所以要定义一个。
        int size = res.size();
        int [] resT = new int[size];
        for(int i = 0;i<size;i++){
            resT[i] = res.pop();
        }
        return resT;
    }
}
````



