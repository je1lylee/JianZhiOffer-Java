package top.linxixixiangxin;

import java.util.Vector;

public class TestClass {
    public float aFun(float a,float b){return 0;}

}
class Child extends TestClass{
    @Override
    public float aFun(float v,float q){return 0;}
}