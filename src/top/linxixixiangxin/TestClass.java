package top.linxixixiangxin;
import com.sun.corba.se.impl.orb.ParserTable;

import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class TestClass {
    private int a = 10;
    int b = 20;
    static int c = 1;
    public static void main(String args[]) {
        char chr = 127;
        int sum = 200;
        chr += 1;
        System.out.println(chr);
        sum += chr;
        System.out.println(sum);
    }


}