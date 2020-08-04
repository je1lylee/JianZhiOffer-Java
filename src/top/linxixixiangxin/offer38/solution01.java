package top.linxixixiangxin.offer38;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class solution01 {
}
class Solution38_01{
    //结果集
    List<String> res = new LinkedList<>();
    //当前拼接的字符
    char[] c;
    public String[] permutation(String s) {
        //字符串 转 字符数组
        c = s.toCharArray();
        //开始递归
        dfs(0);
        //返回结果
        return res.toArray(new String[res.size()]);
    }

    /**
     *
     * @param x 当前固定位
     */
    void dfs(int x) {
        //代表所有位已固定，将当前组合c转化为字符串并加入res
        if(x == c.length - 1) {
            res.add(String.valueOf(c)); // 添加排列方案
            return;
        }
        //初始化一个Set，用于排除重复的字符；将第x位字符与i∈[x,len(c)]字符分别交换，并进入下层递归
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            //c[i]在Set中 代表其是重复字符
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            //加入set 以便遇到重复字符时剪枝
            set.add(c[i]);
            //固定字符 即固定c[i]为当前位字符
            swap(i, x); // 交换，将 c[i] 固定在第 x 位
            //开始下一层递归 开始固定第x+1个字符
            dfs(x + 1); // 开启固定第 x + 1 位字符
            // 还原之前完成得交换
            swap(i, x); // 恢复交换
        }
    }
    //交换字符数组中的两个元素 a b分别为其下标
    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}