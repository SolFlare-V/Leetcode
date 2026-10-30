
import java.util.*;

class Solution {
    public int clumsy(int n) {
        Stack<Integer> stack = new Stack<>();

        stack.push(n);

        int operation = 0;

        for (int i = n - 1; i >= 1; i--) {

            if (operation == 0) {
                stack.push(stack.pop() * i);
            } 
            else if (operation == 1) {
                stack.push(stack.pop() / i);
            } 
            else if (operation == 2) {
                stack.push(i);
            } 
            else {
                stack.push(-i);
            }

            operation = (operation + 1) % 4;
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
