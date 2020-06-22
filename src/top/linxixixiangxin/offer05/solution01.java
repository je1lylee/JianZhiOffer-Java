package top.linxixixiangxin.offer05;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution05_01().replaceSpace("We are happy."));
    }
}
class Solution05_01 {
    public String replaceSpace(String s) {
        //来自LeetCode官方题解
        int length = s.length();
        //如果字符串中全部都是空格 开辟3倍的空间也是足够的
        char[] array = new char[length * 3];
        int size = 0;
        //扫描整个字符串
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                //追加字符
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                //追加字符
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
}