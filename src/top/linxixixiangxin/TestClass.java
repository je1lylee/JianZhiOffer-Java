package top.linxixixiangxin;

import java.util.Vector;

public class TestClass {
    public static void main(String[] args) {
        Vector<String> myVector = new Vector<String>(2);
        for(int i = 0;i<10;i++){
            System.out.println(i + "Size" + myVector.size());
            System.out.println(i + "Capacity" + myVector.capacity());
            myVector.addElement("Welcome");
        }

    }
}
