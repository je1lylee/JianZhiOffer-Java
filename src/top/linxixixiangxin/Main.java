package top.linxixixiangxin;


public class Main {
    public static void main(String[] args) {
        magic(0);
    }
    public static int magic(int testNum){
        if (testNum > 10) return testNum;
        System.out.println(magic(testNum+1));
        return testNum;
    }
}