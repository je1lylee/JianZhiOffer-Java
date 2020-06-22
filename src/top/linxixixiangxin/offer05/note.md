## [剑指 Offer 05. 替换空格](https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/)

#### 解法1

​		使用`StringBuilder`构建出一个新字符串，扫描原字符串将对应的数据填入即可。

````java
class Solution05_01 {
    public String replaceSpace(String s) {
        //使用stringbuilder构建一个新的字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s.length();i ++){
            //1ms 37.8MB
            //sb.append(s.charAt(i) == ' '?"%20":s.charAt(i));
            //0ms 37.5MB
            if(s.charAt(i) == ' ') sb.append("%20");
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
````

时间复杂度 `O(N)` ： 遍历使用 `O(N)` ，每轮添加（修改）字符操作使用 `O(1)`；
空间复杂度 `O(N)` ： Python 新建的 list 和 Java 新建的 `StringBuilder` 都使用了线性大小的额外空间。

#### 解法2（LeetCode）

由于每次替换从 1 个字符变成 3 个字符，使用字符数组可方便地进行替换。建立字符数组地长度为 s 的长度的 3 倍，这样可保证字符数组可以容纳所有替换后的字符。获得 s 的长度 length创建字符数组 array，其长度为 length * 3初始化 size 为 0，size 表示替换后的字符串的长度从左到右遍历字符串 s

- 获得 s 的当前字符 c
- 如果字符 c 是空格，则令 array[size] = '%'，array[size + 1] = '2'，array[size + 2] = '0'，并将 size 的值加 3

- 如果字符 c 不是空格，则令 array[size] = c，并将 size 的值加 1


遍历结束之后，size 的值等于替换后的字符串的长度，从 array 的前 size 个字符创建新字符串，并返回新字符串

````java
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
````

