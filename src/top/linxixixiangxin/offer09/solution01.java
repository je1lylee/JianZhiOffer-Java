package top.linxixixiangxin.offer09;

import java.util.Stack;

public class solution01 {
    public static void main(String[] args) {
        CQueue09_01 cQueue = new CQueue09_01();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());

    }
}

class CQueue09_01 {
    private Stack<Integer> main = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public CQueue09_01() {

    }

    public void appendTail(int value) {
        if (main.size() == 0) {
            main.push(value);
            return;
        }
        while (main.size() > 0) {
            //清空main中的元素
            temp.push(main.pop());
        }
        main.push(value);
        while (temp.size() > 0) {
            main.push(temp.pop());
        }
    }

    public int deleteHead() {
        if (main.size() == 0) return -1;
        return main.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */