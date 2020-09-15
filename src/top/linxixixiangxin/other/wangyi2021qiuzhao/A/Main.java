package top.linxixixiangxin.other.wangyi2021qiuzhao.A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        Queue<TreeNode> queue = new LinkedList<>();
        int m = sc.nextInt();int n = sc.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            Integer root = sc.nextInt();
            String part = sc.next();
            Integer value = sc.nextInt();
            if(Garbage.contains(root)){

            }

        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}