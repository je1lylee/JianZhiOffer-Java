package top.linxixixiangxin.other.tengxun2021qiuzhao.B;

import com.sun.prism.RectShadowGraphics;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String library = sc.nextLine();
        Integer target = sc.nextInt();
//        TreeMap<Integer,String> resMap = new TreeMap<>();
        TreeSet<String> resSet = new TreeSet<>();
//        TreeSet<Integer> indexSet = new TreeSet<>();
        for(int i = 0; i < library.length(); i++){
            for (int j = i+1; j<=library.length(); j++){
                String s = library.substring(i,j);
//                int size = 0;
//                for (int n = 0;n<s.length();n++){
//                    size += s.charAt(n);
//                }
//                resMap.put(size,s);
                resSet.add(s);
                if (resSet.size() == target){
                    System.out.println(resSet.last());
                    return;
                }
//                indexSet.add(size);

            }
        }
//        int g = 0;
//        for (String integer : resSet) {
//            if (g == target-1) {
//                System.out.println(integer);
//                break;
//            }
//            else g++;
//        }

    }
}
