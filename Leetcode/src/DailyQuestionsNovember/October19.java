package DailyQuestionsNovember;

public class October19 {
	public class Solution {
	    public char findKthBit(int n, int k) {
	        if (n == 1) {
	            return '0';
	        }
	        
	        int len = (1 << n) - 1;
	        int middle = len / 2 + 1;

	        if (k == middle) {
	            return '1';
	        }
	        if (k < middle) {
	            return findKthBit(n - 1, k);
	        }

	        char result = findKthBit(n - 1, len - k + 1);
	        if (result == '0') {
	            return '1';
	        }else {
	            return '0';
	        }
	    }
	}
}
