package DailyQuestions;
import java.util.*;

public class October21 {
	public class Solution {
	    private int backtrack(String str, int start, Set<String> seen) {
	        if (start == str.length()) {
	            return 0;
	        }

	        int max = 0;
	        for (int i = start + 1; i <= str.length(); i++) {
	            String curr = str.substring(start, i);
	            if (!seen.contains(curr)) {
	                seen.add(curr);
	                max = Math.max(max, 1 + backtrack(str, i, seen));
	                seen.remove(curr);
	            }
	        }
	        return max;
	    }

	    public int maxUniqueSplit(String s) {
	        int result = backtrack(s, 0, new HashSet<>());
	        return result;
	    }
	}
}
