package top.linxixixiangxin.other.xiaomi2021qiuzhao.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().trim().split(" ");
        for (String input : inputs) {
            if (input.length() < 8 || input.length() > 120) {
                System.out.println("1");
            } else {
                Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
                Pattern pattern1 = pattern.compile("[\\p{Punct}]+");
                Matcher matcher = pattern.matcher(input);
                Matcher matcher1 = pattern1.matcher(input);
                if (matcher.find() && matcher1.find()) {
                    System.out.println("0");
                }else{
                    System.out.println("2");
                }
            }

        }
    }
}