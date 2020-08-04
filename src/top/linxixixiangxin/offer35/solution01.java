package top.linxixixiangxin.offer35;

import java.util.HashMap;
import java.util.Map;

public class solution01 {
    public static void main(String[] args) {
        Node a7 = new Node(7);
        Node a13 = new Node(13);
        Node a11 = new Node(11);
        Node a10 = new Node(10);
        Node a1 = new Node(1);
        a7.next = a13;
        a13.next = a11;
        a11.next = a10;
        a10.next = a1;
        a1.next = null;
        a7.random = null;
        a13.random = a7;
        a11.random = a1;
        a10.random = a11;
        a1.random = a7;
        new Solution35_01().copyRandomList(a7);
        Node master = a7;
        while (master!=null){
            System.out.println(master.next.val);
            master = master.next;
        }
    }
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Node{
    int val;
    Node next;
    Node random;
    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution35_01 {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>(); //创建HashMap集合
        Node cur=head;
        //复制结点值
        while(cur!=null){
            //存储put:<key,value1>
            map.put(cur,new Node(cur.val)); //顺序遍历，存储老结点和新结点(先存储新创建的结点值)
            cur=cur.next;
        }
        //复制结点指向
        cur = head;
        while(cur!=null){
            //得到get:<key>.value2,3
            map.get(cur).next = map.get(cur.next); //新结点next指向同旧结点的next指向
            map.get(cur).random = map.get(cur.random); //新结点random指向同旧结点的random指向
            cur = cur.next;
        }

        //返回复制的链表
        return map.get(head);


    }
}