package DailyQuestionsNovember;
import java.util.*;

public class October20 {
	public class Solution {
	    private List<String> split (String expression) {
	        List<String> result = new ArrayList<>();
	        int balance = 0;
	        StringBuilder curr = new StringBuilder();

	        for (char ch : expression.toCharArray()) {
	            if (ch == ',' && balance == 0) {
	                result.add(curr.toString());
	                curr = new StringBuilder();
	            }else {
	                if (ch == '(') {
	                    balance++;
	                }
	                if (ch == ')') {
	                    balance--;
	                }
	                curr.append(ch);
	            }
	        }
	        result.add(curr.toString());
	        return result;
	    }

	    private boolean evaluate(String expression) {
	        if (expression.equals("t")) {
	            return true;
	        }
	        if (expression.equals("f")) {
	            return false;
	        }

	        char op = expression.charAt(0);
	        String subStr = expression.substring(2, expression.length() - 1);
	        List<String> parts = split(subStr);

	        if (op == '!') {
	            return !evaluate(parts.get(0));
	        }else if (op == '&') {
	            for (String part : parts) {
	                if (!evaluate(part)) {
	                    return false;
	                }
	            }
	            return true;
	        }else if (op == '|') {
	            for (String part : parts) {
	                if (evaluate(part)) {
	                    return true;
	                }
	            }
	            return false;
	        }
	        return false;
	    }

	    public boolean parseBoolExpr(String expression) {
	        return evaluate(expression);
	    }
	}
}
