package top.linxixixiangxin;

import java.time.temporal.Temporal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        scanner.close();
        System.out.println(decode(next));
    }

    public static String decode(String words){
        while (words.contains("]")){
            int right = words.indexOf("]");
            int left = words.lastIndexOf("[", right);
            String repeatStr = words.substring(left+1, right);
            String[] split = repeatStr.split("\\|");
            words = words.replace("["+repeatStr+"]",
                    String.join("", Collections.nCopies(Integer.parseInt(split[0]), split[1])));
        }
        return words;
    }
}