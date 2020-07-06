package top.linxixixiangxin;

import java.lang.reflect.Type;
import java.util.UUID;
import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {
        String para = "index".toUpperCase();
        System.out.println(test.valueOf(para).getType());
    }
}
enum test{
    INDEX(0);
    private Integer type;
    test(int type) {
        this.type = type;
    }
    public Integer getType(){
        return this.type;
    }
}