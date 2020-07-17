package top.linxixixiangxin;

import java.lang.reflect.Type;
import java.util.*;

public class TestClass{
    public static void main(String[] args) throws Exception {
        int i = 0,sum = 0;
        for (i = 0;i<10;++i,sum +=i);
        System.out.println(i);
    }

}
class test{
    private String name;
    public void testtest(){
        name = "FUck";
    }
}