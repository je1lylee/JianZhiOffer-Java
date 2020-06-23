package top.linxixixiangxin.offer07;

import java.util.HashMap;
import java.util.Map;

public class solution01 {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode treeNode = new Solution07_01().buildTree(preorder,inorder);
        //用来测试 可以通过递归的方法按前序遍历输出整个树
//        preOrderTree(treeNode);

    }

    public static void preOrderTree(TreeNode treeNode){
        if(treeNode != null){
            System.out.println(treeNode.val);
            preOrderTree(treeNode.left);
            preOrderTree(treeNode.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution07_01 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //处理异常的输入
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        //存储这棵树的元素数量
        int length = preorder.length;
        //存储一个序列
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }
        //接收创建好的树
        TreeNode root = buildTree(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
        return root;
    }

    /**
     * 构建树
     * 前序和中序遍历的开始和结束都是下标
     * @param preorder 前序遍历
     * @param preorderStart 前序遍历的开始
     * @param preorderEnd 前序遍历的结束
     * @param inorder 中序遍历
     * @param inorderStart 中序遍历的开始
     * @param inorderEnd 中序遍历的结束
     * @param indexMap 创建好的HASHMAP
     * @return
     */
    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
        //异常输入 返回空
        if (preorderStart > preorderEnd) {
            return null;
        }
        //读出根节点的值
        int rootVal = preorder[preorderStart];
        //创建一个根节点
        TreeNode root = new TreeNode(rootVal);
        //只有一个元素 直接返回根节点
        if (preorderStart == preorderEnd) {
            return root;
        } else {
            //获取到对应节点下标
            int rootIndex = indexMap.get(rootVal);
            //左侧节点的数量和右侧节点的数量
            int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
            //递归根节点左侧树
            TreeNode leftSubtree = buildTree(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
            //递归根节点右侧树
            TreeNode rightSubtree = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);
            //根节点左侧的子树
            root.left = leftSubtree;
            //根节点右侧的子树
            root.right = rightSubtree;
            return root;
        }
    }
}