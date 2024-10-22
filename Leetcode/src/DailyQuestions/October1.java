package DailyQuestions;

public class October1 {	
	public class Solution {
	    public boolean canArrange(int[] arr, int k) {
	        int[] rCount = new int[k];

	        for (int num : arr) {
	            int remainder = ((num % k) + k) % k;
	            rCount[remainder]++;
	        }

	        for (int i = 1; i < k; i++) {
	            if (rCount[i] != rCount[k - i]) {
	                return false;
	            }
	        }
	        boolean divCheck = rCount[0] % 2 == 0;
	        return divCheck;
	    }
	}
}
