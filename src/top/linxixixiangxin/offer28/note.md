## [剑指 Offer 28. 对称的二叉树](https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/)

#### 解法1

使用递归完成。

````java
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
````

