package top.linxixixiangxin.offer32_2;

import top.linxixixiangxin.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution01 {
    public static void main(String[] args) {

    }
}
class Solution32_02_01 {
    //层序遍历 BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //如果根节点为空，则返回空数组
        if (root == null) {
            return res;
        }
        //创建一个队列  并添加根节点到队列中
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        //当队列为空时跳出
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            //遍历队列中每个节点
            for(int i = queue.size();i>0;i--){
                //队首元素出队，记为node
                TreeNode node = queue.poll();
                //将此节点的值存入结果数组
                tmp.add(node.val);
                //如果左侧节点不为空 就存入队列
                if (node.left != null) {
                    queue.add(node.left);
                }
                //右侧不为空 就存入队列
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(tmp);

        }
        return res;
    }
}