package DailyQuestionsFebruary;

import java.util.ArrayList;
import java.util.List;

public class February19 {
    class Solution {
        private void backtrack(List<String> result, StringBuilder current, int n) {
            if (current.length() == n) {
                result.add(current.toString());
                return;
            }
    
            for (char ch : new char[]{'a', 'b', 'c'}) {
                if (current.length() == 0 || current.charAt(current.length() - 1) != ch) {
                    current.append(ch);
                    backtrack(result, current, n);
                    current.deleteCharAt(current.length() - 1);
                }
            }
        }
    
        public String getHappyString(int n, int k) {
            List<String> result = new ArrayList<>();
            backtrack(result, new StringBuilder(), n);
    
            if (k > result.size()) {
                return "";
            }
    
            return result.get(k - 1);
        }
    }
}
