package DailyQuestionsNovember;
import java.util.*;

public class October07 {
	public class Solution {
	    public int minLength(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (!stack.isEmpty()) {
	                char top = stack.peek();

	                if (top == 'A' && ch == 'B') {
	                    stack.pop();
	                    continue;
	                }

	                if (top == 'C' && ch == 'D') {
	                    stack.pop();
	                    continue;
	                }
	            }
	            stack.push(ch);
	        }
	        return stack.size();
	    }
	}
}
