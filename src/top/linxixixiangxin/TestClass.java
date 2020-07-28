package top.linxixixiangxin;
import com.sun.corba.se.impl.orb.ParserTable;

import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class TestClass {
    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "hel" + new String("llo");
        System.out.println(str1 == str2);
    }


}