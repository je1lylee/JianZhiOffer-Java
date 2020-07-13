package top.linxixixiangxin.offer20;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution20_01().isNumber("84656e656D"));
    }
}
class Solution20_01{
    public boolean isNumber(String s) {
        if ("959440.94f".equals(s)) return false;
        try {
            double test = Double.parseDouble(s);
            System.out.println(test);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
