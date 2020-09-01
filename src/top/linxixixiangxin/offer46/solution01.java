package top.linxixixiangxin.offer46;

public class solution01 {
    private static char a;
    public static void main(String[] args) {
        System.out.println(new solution46_01().translateNum(12258));
    }
}
class solution46_01{
    public int translateNum(int num) {
        String src = String.valueOf(num);
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < src.length(); ++i) {
            p = q;
            q = r;
            r = 0;
            r += q;
            //跳过第一位，因为第一位i-1会导致越界异常
            if (i == 0) {
                continue;
            }
            //substring 左闭右开区间
            String pre = src.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0) {
                r += p;
            }
        }
        return r;
    }
}