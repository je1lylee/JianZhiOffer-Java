## [剑指 Offer 28. 对称的二叉树](https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/)

#### 解法1

使用递归遍历树的同时交换树的两边即可。

````java
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
}
````

