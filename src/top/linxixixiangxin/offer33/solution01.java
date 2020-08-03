package top.linxixixiangxin.offer33;

public class solution01 {
}
class Solution33_01 {
        public boolean verifyPostorder(int[] postorder) {
            //目标序列 当前下标 最大下标
            return recur(postorder, 0, postorder.length - 1);
        }
        boolean recur(int[] postorder, int i, int j) {
            //子树节点数量<=1 无需判别正确性，返回true
            if(i >= j) {
                return true;
            }
            //划分左右子树，寻找第一个大于根节点的节点，记为m，此时可划分出左子树区间[i,m-1] 右子树区间[m,j-1] 根节点索引j
            int p = i;
            //此处可以保证左侧子树的区间正确性
            while(postorder[p] < postorder[j]) {
                p++;
            }
            int m = p;
            //判断右侧子树的正确性
            while(postorder[p] > postorder[j]) {
                p++;
            }
            //判断此树是非正确，判断此树的左子树是否正确 判断此树的右子树是否正确
            return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
        }
}