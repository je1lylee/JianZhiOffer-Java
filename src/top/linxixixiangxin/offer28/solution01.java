package top.linxixixiangxin.offer28;

public class solution01 {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a3 = new TreeNode(3);
        TreeNode a6 = new TreeNode(6);
        TreeNode a9 = new TreeNode(9);
        TreeNode a2 = new TreeNode(2);
        a2.left = a1;
        a2.right = a3;
        TreeNode a7 = new TreeNode(7);
        a7.left = a6;
        a7.right = a9;
        TreeNode a4 = new TreeNode(4);
        a4.left = a2;
        a4.right = a7;
        System.out.println(new Solution28_01().isSymmetric(a4));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution28_01 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return magic(root.left,root.right);
    }
    public boolean magic(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if (left == null || right == null || right.val != left.val){
            return false;
        }
        return magic(left.left,right.right) && magic(left.right,right.left);
    }
}