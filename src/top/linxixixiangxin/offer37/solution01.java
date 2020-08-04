package top.linxixixiangxin.offer37;

import top.linxixixiangxin.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution01 {
}

class Codec {
    public String serialize(TreeNode root) {
        //特殊值处理
        if (root == null) return "[]";
        //构建序列
        StringBuilder res = new StringBuilder("[");
        //将根节点加入队列中
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            //处理出队元素
            TreeNode node = queue.poll();
            //如果该元素不为空
            if (node != null) {
                //将此元素的值加入序列
                res.append(node.val + ",");
                //将此元素的左右节点加入队列
                queue.add(node.left);
                queue.add(node.right);
                //如果为空，就把空放到序列中
            } else res.append("null,");
        }
        //删除多余的,
        res.deleteCharAt(res.length() - 1);
        //格式
        res.append("]");
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        //特殊值处理
        if (data.equals("[]")) return null;
        //去掉[] 通过,分割出元素
        String[] vals = data.substring(1, data.length() - 1).split(",");
        //构建根节点
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        //将根节点加入队列中
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        //指向节点node的左右子节点，每构建一个node的左右子节点 指针i就向右移动一位
        int i = 1;
        while (!queue.isEmpty()) {
            //出队一个元素
            TreeNode node = queue.poll();
            //构建node的左子节点，node.left的值为vals[i]，并将node.left入队
            if (!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            //构建node的右子节点node.left的值为vals[i]，并将node.left入队
            if (!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}