package top.linxixixiangxin.offer32_1;

import top.linxixixiangxin.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution01 {
    public static void main(String[] args) {

    }
}

class Solution32_01_01 {
    //层序遍历 BFS
    public int[] levelOrder(TreeNode root) {
        //如果根节点为空，则返回空数组
        if (root == null) {
            return new int[0];
        }
        //创建一个队列  并添加根节点到队列中
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        //当队列为空时跳出
        while (!queue.isEmpty()) {
            //队首元素出队，记为node
            TreeNode node = queue.poll();
            //将此节点的值存入结果数组
            ans.add(node.val);
            //如果左侧节点不为空 就存入队列
            if (node.left != null) {
                queue.add(node.left);
            }
            //右侧不为空 就存入队列
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        //ArrayList转数组
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}