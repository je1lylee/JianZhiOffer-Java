## [剑指 Offer 26. 树的子结构](https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/)

#### 解法1

使用前序遍历逐个匹配。

````java
class Solution26_01 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        /**
         * 1.处理异常的输入，有一棵树为空就返回false
         * 2.分别遍历根节点的两侧
         */
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    //先序遍历
    boolean recur(TreeNode A, TreeNode B) {
        //如果节点B为空，说明树B已匹配完成，越过了叶子节点，所以返回true
        if(B == null) {
            return true;
        }
        //A为空，说明越过过A的叶子节点，意味着匹配失败返回false
        if(A == null || A.val != B.val) {
            return false;
        }
        //遍历两棵树左侧，遍历两棵树右侧
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
````



