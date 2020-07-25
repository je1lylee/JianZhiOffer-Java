package top.linxixixiangxin.offer31;

import java.util.Stack;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution31_01().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5,3,2,1}));
    }
}
class Solution31_01 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            // num 入栈
            stack.push(num);
            // 循环判断与出栈(每次入栈完都进行测试
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
