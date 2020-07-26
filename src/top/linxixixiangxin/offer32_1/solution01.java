package top.linxixixiangxin.offer32_1;

import top.linxixixiangxin.TreeNode;

public class solution01 {
}
class Solution32_01_01 {
    int[] res = new int[1000];
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }else{
            int index = 1;
            res[0] = root.val;
            magic(root.left,root.right,index);
            return res;
        }
    }
    public void magic(TreeNode left,TreeNode right,int index){
        if(left!= null){
            res[index] = left.val;
        }
    }
}