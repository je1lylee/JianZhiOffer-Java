package top.linxixixiangxin.offer55_01;

import top.linxixixiangxin.TreeNode;

public class solution01 {
    public static void main(String[] args) {

    }
}
class Solution55_01_01{
    Integer max = 0;
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
