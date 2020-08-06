package top.linxixixiangxin.offer43;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution43_01().countDigitOne(8));
    }
}
class Solution43_01 {
    public int countDigitOne(int n) {
        //定义位因子 和结果
        int digit = 1, res = 0;
        //定义高位          当前位          低位
        //从数字的十位开始计算
        //如果输入数字是8则
        //high = 0 cur = 8 low = 0
        int high = n / 10, cur = n % 10, low = 0;
        System.out.printf("%d,%d,%d",high,cur,low);
        //当高位不等于0 或 当前位不等于0时
        while(high != 0 || cur != 0) {
            //如果当前位是0 满足此位1出现的次数为 high* digit
            if(cur == 0) res += high * digit;
            //如果当前位是1 满足此位1出现的次数为 high * digit + low +1;
            else if(cur == 1) res += high * digit + low + 1;
            //当前位是2~9 满足此位1出现的次数为 (high + 1)*digit
            else res += (high + 1) * digit;
            //低位 + 当前位 * 位因子
            low += cur * digit;
            //当前位 = 取高位最后一位
            cur = high % 10;
            //高位 取除了最后一位的前几位
            high /= 10;
            //digit跳到更高一位
            digit *= 10;
        }
        return res;
    }
}