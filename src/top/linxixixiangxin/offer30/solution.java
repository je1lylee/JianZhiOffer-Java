package top.linxixixiangxin.offer30;

import java.util.Stack;

public class solution {
    public static void main(String[] args) {
        MinStack30_01 minStack = new MinStack30_01();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println("minStack.min() = " + minStack.min());
        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println("minStack.top() = " + minStack.top());
        System.out.println("minStack.min() = " + minStack.min());
    }
}
class MinStack30_01 {
    Stack<Integer> stackMain;
    Stack<Integer> stackDaemon;
    /** initialize your data structure here. */
    public MinStack30_01() {
        stackMain = new Stack<>();
        stackDaemon = new Stack<>();
    }

    public void push(int x) {
        //如果多个重复的元素被插入 在pop的时候会导致栈内元素的不严格升序被打破
        if(stackDaemon.size() == 0 || x <= stackDaemon.lastElement()){
            stackDaemon.push(x);
        }
        stackMain.push(x);
    }

    public void pop() {
        int x = stackMain.pop();
        if(x == stackDaemon.lastElement()){
            stackDaemon.pop();
        }
    }

    public int top() {
        return stackMain.lastElement();
    }

    public int min() {
        return stackDaemon.lastElement();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */