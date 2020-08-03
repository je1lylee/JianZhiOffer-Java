package top.linxixixiangxin.offer34;

import top.linxixixiangxin.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class solution01 {
}
class Solution34_01 {
    //结果列表
    LinkedList<List<Integer>> res = new LinkedList<>();
    //路径列表（路径列表里存储着当前走过的路径，已经走过的路径通过removeLast()被移出了序列
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }
    //当前节点root 当前目标值tar
    void recur(TreeNode root, int tar) {
        //终止递归的条件
        if(root == null) {
            return;
        }
        //路径更新，将当前节点值加入路径path
        path.add(root.val);
        //目标值更新
        tar -= root.val;
        //路径记录 当 root 为叶子节点 且 路径和等于目标值，将此路径path加入res
        if(tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList(path));
        }
        //先序遍历 左节点
        recur(root.left, tar);
        //右节点
        recur(root.right, tar);
        //路径恢复，向上回溯前，需要将当前节点从路径path中删除，执行path.pop()
        path.removeLast();
    }
}