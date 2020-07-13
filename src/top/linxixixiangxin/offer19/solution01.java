package top.linxixixiangxin.offer19;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution19_01().isMatch("ab", ".*"));
    }
}

class Solution19_01 {
    /**
     *请实现一个函数用来匹配包含'. '和'*'的正则表达式。
     * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。
     * 例如：
     * 字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。
     * @param s 目标串
     * @param p 模式
     * @return
     */
    public boolean isMatch(String s, String p) {
        // 如果字符串长度为0，需要检测下正则串
        if (s.length() == 0) {
            // 如果正则串长度为奇数，必定不匹配，比如 "."、"ab*",必须是 a*b*这种形式，*在奇数位上
            if (p.length() % 2 != 0) {
                return false;
            }
            int i = 1;
            //遍历模式串
            while (i < p.length()) {
                if (p.charAt(i) != '*') {
                    return false;
                }
                i += 2;
            }
            return true;
        }
        // 如果字符串长度不为0，但是正则串没了，return false
        if (p.length() == 0) {
            return false;
        }
        // c1 和 c2 分别是两个串的当前位，c3是正则串当前位的后一位，如果存在的话，就更新一下
        char c1 = s.charAt(0), c2 = p.charAt(0), c3 = 'a';
        //判断是否存在后一个字符 如果String长度>1就有
        if (p.length() > 1) {
            c3 = p.charAt(1);
        }
        // 和dp一样，后一位分为是 '*' 和不是 '*' 两种情况
        if (c3 != '*') {
            // 如果该位字符一样，或是正则串该位是 '.',也就是能匹配任意字符，就可以往后走
            if (c1 == c2 || c2 == '.') {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                // 否则不匹配
                return false;
            }
            //[]*
        } else {
            // 如果该位字符一样，或是正则串该位是 '.'，和dp一样，有看和不看两种情况
            if (c1 == c2 || c2 == '.') {
                //字符串往后走一位 或者规则往后走两位
                return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            } else {
                // 不一样，那么正则串这两位就废了，直接往后走
                return isMatch(s, p.substring(2));
            }
        }
    }
}