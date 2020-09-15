package top.linxixixiangxin.dp.lc978;

public class Main {
    public static void main(String[] args) {
        String test = "";test += 'd';
    }
}

class Solution978_01 {
    public int maxTurbulenceSize(int[] A) {
        //true >
        //false <
        int maxLen = 2;
        boolean status = false;
        if (A[1] > A[0]){
            status = true;
        }else if(A[1] < A[0]){
            status = false;
        }
        return 0;
    }
    public boolean isABiggerThanB(int A,int B){
        return A>B?true:false;
    }
}