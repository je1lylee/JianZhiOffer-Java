package top.linxixixiangxin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestClass {
    public static void main(String[] args) {
        //创建一个棋盘
        int[][] qipan = new int[11][11];
        //棋盘里有两个棋子
        qipan[2][2] = 1;
        qipan[5][5] = 2;
        System.out.println("##输出原棋盘元素##");
        for (int[] ints : qipan) {
            for (int i : ints) {
                System.out.printf("%d\t",i);
            }
            //格式化换行
            System.out.println("");
        }
        //--------------------------------------
        int sum = 0;
        for (int[] ints : qipan) {
            for (int i : ints) {
                if(i != 0) sum++;
            }
            //格式化换行
            System.out.println("");
        }
        int[][] xishu = new int[sum+1][3];
        //初始化稀疏数组的第一行数据
        //1.原数组高度 2.原数组宽度 3.含有数据单元格个数
        xishu[0][0] = qipan.length;
        xishu[0][1] = qipan[0].length;
        xishu[0][2] = sum;
        int index = 1;
        for(int i = 0;i< qipan.length;i++){
            for(int j = 0;j<qipan[0].length;j++){
                if(qipan[i][j] != 0){
                    xishu[index][0] = i;
                    xishu[index][1] = j;
                    xishu[index][2] = qipan[i][j];
                    xishu[0][2] = index;
                    index++;
                }
            }
        }
        System.out.println("稀疏数组");
        for (int[] ints : xishu) {
            for (int i : ints) {
                System.out.printf("%d\t",i);
                //对非0元素进行计数
            }
            //格式化换行
            System.out.println("");
        }
        int[][] xinqipan = new int[xishu[0][0]][xishu[0][1]];
        for(int i = 1;i<=xishu[0][2];i++){
            xinqipan[xishu[i][0]][xishu[i][1]] = xishu[1][2];
        }
        System.out.println("还原棋盘");
        for (int[] ints : xinqipan) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println("");

        }


    }


}