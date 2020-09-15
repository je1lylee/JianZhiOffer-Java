package top.linxixixiangxin.offer54;

import top.linxixixiangxin.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class solution01 {
    public static void main(String[] args) {

    }
}

class Solution54_01 {
    //第k大值 当前遍历到的第k大节点
    int res, k;

    public int kthLargest(TreeNode root, int k) {
        //初始化k值
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }
}