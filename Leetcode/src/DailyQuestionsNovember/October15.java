package DailyQuestionsNovember;

public class October15 {
	public class Solution {
	    public long minimumSteps(String s) {
	        int n = s.length();
	        int count1 = 0;
	        long swaps = 0;

	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == '1') {
	                count1++;
	            }else {
	                swaps += count1;
	            }
	        }
	        return swaps;
	    }
	}
}
