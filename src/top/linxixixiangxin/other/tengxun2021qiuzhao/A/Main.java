package top.linxixixiangxin.other.tengxun2021qiuzhao.A;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //length of linked list
        int n = sc.nextInt();
        //the node that will delete
        int k = sc.nextInt();
        listNode head = new listNode(0);
        listNode temp = new listNode(sc.nextInt());
        head.next = temp;
        listNode pre = null;
        listNode delete = null;
        for (int i = 1; i < n; i++) {
            listNode listNode = new listNode(sc.nextInt());
            temp.next = listNode;
            if (i == k-1) pre = temp;
            temp = temp.next;
            if (i == k-1) delete = temp;

        }
        pre.next = delete.next;
        temp = head.next;
        head = head.next;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }


    }

}

class listNode {
    Integer val;
    listNode next = null;

    public listNode(int val) {
        this.val = val;
    }
}