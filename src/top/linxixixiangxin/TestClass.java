package top.linxixixiangxin;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n是不超过n的前提下有多少逆序数
        long n = sc.nextLong();
        long lowerNumber = 2178;
        int targetNumberCount = 0;
        ArrayList<String> res = new ArrayList<>();
        //保证某个数乘以4后还在n的范围区间内
        while (lowerNumber*4 <= n){
            String highNumber = String.valueOf(lowerNumber*4);
            String copyOfLowNumber = String.valueOf(lowerNumber);
            boolean isOK = true;
            if(highNumber.length() == copyOfLowNumber.length()){
                for(int i = 0;i<highNumber.length();i++){
                    if(getDigit(copyOfLowNumber,i) != getDigit(highNumber,copyOfLowNumber.length()-i)){
                        isOK = false;
                        break;
                    }
                }
            }
            if(isOK){
                res.add(copyOfLowNumber);
                res.add(highNumber);
                targetNumberCount++;
            }
            highNumber += 1;
        }
        if(targetNumberCount == 0){
            System.out.println(0);
        }else{
            System.out.println(targetNumberCount);
            for(int i = 0;i<res.size();i+=2){
                System.out.printf("%s %s",res.get(i),res.get(i+1));
            }
        }
    }
    static int getDigit(String number,int index){
        Character c = number.charAt(index);
        return Integer.parseInt(c.toString());
    }
}