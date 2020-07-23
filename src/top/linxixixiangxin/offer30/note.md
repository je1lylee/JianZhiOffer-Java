## [剑指 Offer 30. 包含min函数的栈](https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/)

#### 解法1

​		创建一个栈用来存储所有元素，创建另一个栈，栈内元素满足非严格升序。入栈的时候判断daemon栈顶元素是否小于插入元素，如果是就不插入。出栈的时候判断Main出栈元素和daemon栈顶元素是否相同，如果相同就一起出栈。

````java
import java.util.Stack;
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stackMain;
    Stack<Integer> stackDaemon;
    /** initialize your data structure here. */
    public MinStack() {
        stackMain = new Stack<>();
        stackDaemon = new Stack<>();
    }

public void push(int x) {
        if(stackDaemon.size() == 0 || x <= stackDaemon.lastElement()){
            stackDaemon.push(x);
        }
        stackMain.push(x);
    }

    public void pop() {
        if(stackDaemon .size() == 0){
            return;
        }
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
````

