package top.linxixixiangxin;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int k = 0;k<x;k++){
            //原数组
            String rawData = scanner.next();
            //拼接后的字符串
            StringBuilder string = new StringBuilder();
            char tempA = '0',tempB = '0';boolean isDouble = false;
            for(int i = 0;i<rawData.length();i++){
                //已经检测到前面有两个一样的元素了
                if(isDouble){
                    if(rawData.charAt(i) == tempA){
                        tempA = '0';
                        isDouble = false;
                        continue;
                    }else if(rawData.charAt(i) != tempA && tempB == '0'){
                        tempB = rawData.charAt(i);
                    }else if (rawData.charAt(i) != tempA && rawData.charAt(i) == tempB){
                        tempA = '0';
                        tempB = '0';
                        isDouble = false;
                        continue;
                    }

                }else{
                    string.append(rawData.charAt(i));
                    if (tempA == '0' || tempA != string.charAt(i)){
                        tempA = rawData.charAt(i);
                    }else if(tempA == rawData.charAt(i)){
                        isDouble = true;
                    }
                }
            }
            System.out.println(string);
        }
    }
}