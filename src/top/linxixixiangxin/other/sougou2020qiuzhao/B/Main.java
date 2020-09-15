package top.linxixixiangxin.other.sougou2020qiuzhao.B;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solutionxx().getPasswordCount("09"));
    }
}


class Solutionxx {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
    public long getPasswordCount (String password) {
        if (password.length() == 1) return 9;
        // write code here
        long[] dp = new long[password.length()];
        dp[0] = 10;
        boolean magic = true;
        for (int i = 1;i<dp.length;i++){
            //偶数
            if (Integer.valueOf(password.charAt(i)) %2 == 0){
                dp[i] = (long) (dp[i-1] + Math.floor(dp[i-1]/2));
                if (dp[i] % 2 != 0) magic = false;
            }else{
                dp[i] = (long) (dp[i-1] + Math.ceil(dp[i-1]/2));
                if (dp[i] % 2 != 1) magic = false;
            }
        }
        if (magic){
            return dp[dp.length-1];
        }else{
            return dp[dp.length-1]-1;
        }
    }
}