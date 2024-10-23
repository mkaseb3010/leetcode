package DailyQuestions;

public class October08 {
	public class Solution {
	    public int minSwaps(String s) {
	        int min = 0;
	        int max = 0;

	        for (char ch : s.toCharArray()) {
	            if (ch == '[') {
	                min--;
	            }else {
	                min++;
	            }
	            max = Math.max(max, min);
	        }
	        min = (max + 1) / 2;
	        return min;
	    }
	}
}
