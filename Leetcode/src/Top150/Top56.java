package Top150;

import java.util.Stack;

public class Top56 {
    public class Solution {
        public int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int op = 0;
            int result = 0;
            int sign = 1;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    op = 10 * op + (int) (ch - '0');
                }else if (ch == '+') {
                    result += sign * op;
                    sign = 1;
                    op = 0;
                }else if (ch == '-') {
                    result += sign * op;
                    sign = -1;
                    op = 0;
                }else if (ch == '(') {
                    stack.push(result);
                    stack.push(sign);
                    sign = 1;
                    result = 0;
                }else if (ch == ')') {
                    result += sign * op;
                    result *= stack.pop();
                    result += stack.pop();
                    op = 0;
                }
            }
            return result + (sign * op);
        }
    }
}
