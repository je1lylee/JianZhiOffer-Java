package top.linxixixiangxin.offer09;

import java.util.Stack;

public class solution02 {
    public static void main(String[] args) {
        CQueue09_02 cQueue = new CQueue09_02();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

    }
}
class CQueue09_02 {
    private Stack<Integer> main = new Stack<>();
    private Stack<Integer> temp = new Stack<>();
    public CQueue09_02() {

    }

    public void appendTail(int value) {
        main.push(value);
    }

    public int deleteHead() {
        if(main.size() == 0 && temp.size() == 0) return -1;
        if(temp.size() == 0){
            while (main.size() != 0){
                temp.push(main.pop());
            }
            return temp.pop();
        }else{
            return temp.pop();
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */