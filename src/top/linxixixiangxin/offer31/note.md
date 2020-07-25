## [剑指 Offer 31. 栈的压入、弹出序列](https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/)

#### 解法1

初始化：辅助栈stack，弹出序列的索引i；

遍历压栈序列：各元素标记为num；元素num入栈；循环出栈，若stack的栈顶元素==弹出序列元素poped[i]，则执行出栈和i++；

返回值：如果stack为空，则弹出序列合法。

````java
class Solution31_01 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            // num 入栈
            stack.push(num);
            // 循环判断与出栈
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}

````

