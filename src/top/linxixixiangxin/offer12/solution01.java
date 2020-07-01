package top.linxixixiangxin.offer12;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution12_01());
    }
}
class Solution12_01 {
    public boolean exist(char[][] board, String word) {
        //将字符串转换为Char类型数组
        char[] words = word.toCharArray();
        //纵向遍历矩阵
        for(int i = 0; i < board.length; i++) {
            //横向便利矩阵
            for(int j = 0; j < board[0].length; j++) {
                //dfs返回true则true
                if(dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param board 矩阵
     * @param word 目标字符串
     * @param i x坐标
     * @param j y坐标
     * @param k 当前目标字符在word中的索引
     * @return
     */
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        //i越界|i值异常|j越界|j值异常|坐标对应的值和word中对应的值不一样
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        //字符串已全部匹配
        if(k == word.length - 1) {
            return true;
        }
        //当前矩阵中对应的值
        char tmp = board[i][j];
        //已经走过的元素赋值为/
        board[i][j] = '/';
        /**
         * 目标上侧
         * 目标下侧
         * 目标左侧
         * 目标右侧
         * 满足题干中的要求
         * "每一步可以在矩阵中向左、右、上、下移动一格。"
         */
        boolean res =
                dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i , j - 1, k + 1);
        //还原当前矩阵元素（递归是一层一层的
        board[i][j] = tmp;
        //代表是否搜索到目标字符串
        return res;
    }
}