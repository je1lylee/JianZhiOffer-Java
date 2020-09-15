package top.linxixixiangxin.other.tengxun2021qiuzhao1.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode firstList = new ListNode(sc.nextInt());
        ListNode temp = firstList;
        for (int i = 1;i<n;i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        int m = sc.nextInt();
        ListNode secondList = new ListNode(sc.nextInt());
        temp = secondList;
        for(int i = 1;i<m;i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        sc.close();
        while (firstList != null && secondList != null){
            if (firstList.val == secondList.val){
                System.out.print(firstList.val + " ");
                firstList = firstList.next;
                secondList = secondList.next;
            }else if(firstList.val > secondList.val){
                firstList = firstList.next;
            }else{
                secondList = secondList.next;
            }
        }

    }
}

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
