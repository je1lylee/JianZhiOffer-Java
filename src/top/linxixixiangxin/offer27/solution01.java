package top.linxixixiangxin.offer27;

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
        new Solution27_01().showMeTree(new Solution27_01().mirrorTree(a4));
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

class Solution27_01 {
    public TreeNode mirrorTree(TreeNode root) {
        //递归条件
        if (root == null) {
            return null;
        }
        //将左侧树存入临时值
        TreeNode temp = root.left;
        //右侧值覆盖左侧值
        root.left = mirrorTree(root.right);
        //临时值（左侧)覆盖右侧值
        root.right = mirrorTree(temp);
        return root;
    }

    public void showMeTree(TreeNode root) {
        //递归条件
        if (root != null) {
            System.out.println(root.val);
            showMeTree(root.left);
            showMeTree(root.right);
        }
    }
}