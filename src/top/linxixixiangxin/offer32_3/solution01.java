package top.linxixixiangxin.offer32_3;

import top.linxixixiangxin.TreeNode;

import java.time.temporal.Temporal;
import java.util.*;

public class solution01 {
    public static void main(String[] args) {
        TreeNode a15 = new TreeNode(15);
        TreeNode a7 = new TreeNode(7);
        TreeNode a9 = new TreeNode(9);
        TreeNode a20 = new TreeNode(20);
        TreeNode a3 = new TreeNode(3);
        a3.left = a20;a3.right = a9;
        a20.left = a7;a20.right = a15;
        List<List<Integer>>  res= new Solution32_03_01().levelOrder(a3);
        for (List<Integer> list : res){
            System.out.print("[");
            for(Integer item:list){
                System.out.print(item);
                System.out.print(",");
            }
            System.out.println("]");
        }
    }
}
class Solution32_03_01 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                //通过不同的顺序添加节点，因为是二叉树
                if(res.size() % 2 == 0) {
                    // 奇数层 -> 队列头部
                    tmp.addLast(node.val);
                } else {
                    // 偶数层 -> 队列尾部
                    tmp.addFirst(node.val);
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}