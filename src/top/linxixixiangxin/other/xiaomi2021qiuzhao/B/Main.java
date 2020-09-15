package top.linxixixiangxin.other.xiaomi2021qiuzhao.B;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] table = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        //已经用过的设置为'0'
        int indexOfWords = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<3;i++){
            for (int j = 0;i<4;j++){
                if (table[i][j] == word.charAt(0)){
                    queue.add(new int[]{i,j});
                }
            }
        }
        while (!queue.isEmpty() && indexOfWords < word.length()){
            int[] temp = queue.poll();
            int x = temp[0];int y = temp[1];
            if(x + 1 < 2 && table[x+1][y] == word.charAt(indexOfWords + 1)){
                queue.add(new int[]{x+1,y});
            }
            if(x-1>=0 && table[x-1][y] == word.charAt(indexOfWords +1)){
                queue.add(new int[]{x-1,y});
            }
            if(y + 1<3  && table[x][y+1]  == word.charAt(indexOfWords +1)){
                queue.add(new int[]{x,y+1});
            }
            if(y-1>=0 && table[x][y-1] == word.charAt(indexOfWords + 1)){
                queue.add(new int[]{x,y-1});
            }
            indexOfWords ++;
        }
        if (indexOfWords == word.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
