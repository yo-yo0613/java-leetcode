package String.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 ()[]{}: " + sol.isValid("()[]{}"));
        System.out.println("Test 2 ([)] : " + sol.isValid("([)]"));
    }
}

class Solution {
    public boolean isValid(String s) {
        // 使用 Deque 作為 Stack
        Deque<Character> stack = new ArrayDeque<>();

        // 遍歷字串
        // toCharArray() 會把字串轉成字元陣列
        for (char c : s.toCharArray()) {
            // 如果是左括號，就把對應的右括號丟進去
            if (c == '(') {
                stack.push(')');   
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } 
            // 如果是右括號
            // 1. 檢查堆疊是否以空 (代表沒有左括號)
            // 2. 檢查彈出的右括號是否與當前字元一致
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        // 最後檢查堆疊是否還有剩餘的左括號
        return stack.isEmpty();
    }
}