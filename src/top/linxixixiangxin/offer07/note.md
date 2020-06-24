## [剑指 Offer 07. 重建二叉树](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/)

### 解法1

​		能力有限，题解来自Leetcode...Orz

> 二叉树的前序遍历顺序是：根节点、左子树、右子树，每个子树的遍历顺序同样满足前序遍历顺序。
>
> 二叉树的中序遍历顺序是：左子树、根节点、右子树，每个子树的遍历顺序同样满足中序遍历顺序。
>
> 前序遍历的第一个节点是根节点，只要找到根节点在中序遍历中的位置，在根节点之前被访问的节点都位于左子树，在根节点之后被访问的节点都位于右子树，由此可知左子树和右子树分别有多少个节点。
>
> 由于树中的节点数量与遍历方式无关，通过中序遍历得知左子树和右子树的节点数量之后，可以根据节点数量得到前序遍历中的左子树和右子树的分界，因此可以进一步得到左子树和右子树各自的前序遍历和中序遍历，可以通过递归的方式，重建左子树和右子树，然后重建整个二叉树。
>
> 使用一个 Map 存储中序遍历的每个元素及其对应的下标，目的是为了快速获得一个元素在中序遍历中的位置。调用递归方法，对于前序遍历和中序遍历，下标范围都是从 0 到 n-1，其中 n 是二叉树节点个数。
>
> 递归方法的基准情形有两个：判断前序遍历的下标范围的开始和结束，若开始大于结束，则当前的二叉树中没有节点，返回空值 null。若开始等于结束，则当前的二叉树中恰好有一个节点，根据节点值创建该节点作为根节点并返回。
>
> 若开始小于结束，则当前的二叉树中有多个节点。在中序遍历中得到根节点的位置，从而得到左子树和右子树各自的下标范围和节点数量，知道节点数量后，在前序遍历中即可得到左子树和右子树各自的下标范围，然后递归重建左子树和右子树，并将左右子树的根节点分别作为当前根节点的左右子节点。
>

````java
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
        //把中序遍历的树存入HashMap
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
            System.out.println("inorder[i] = " + inorder[i]);
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
        //异常 返回空
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
````

