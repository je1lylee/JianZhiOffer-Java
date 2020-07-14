package top.linxixixiangxin.offer20;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution20_01().isNumber("84656e656D"));
    }
}
class Solution20_01{
    /**
     * 表示数值的字符串遵循模式A[.[B]][e|EC] 或者 .B[e|EC]
     * A为数值的整数部分，B紧跟着小数点为数值的小数部分，C紧跟着e|E为数值的指数部分。
     * 在小数里可能没有数值得到整数部分。
     * 例如小数.123 等于0.123 因此A部分不是必须的，
     * 如果一个数没有整数部分，那么他的小数部分不能为空
     * @param s
     * @return
     */
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        return core(s,0);
    }

    public boolean core(String s,Integer index){

    }
}
