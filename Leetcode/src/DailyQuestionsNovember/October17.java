package DailyQuestionsNovember;

public class October17 {
	public class Solution {
	    public int maximumSwap(int num) {
	        char[] digits = Integer.toString(num).toCharArray();
	        int[] last = new int[10];

	        for (int i = 0; i < digits.length; i++) {
	            last[digits[i] - '0'] = i;
	        }

	        for (int i = 0; i < digits.length; i++) {
	            for (int k = 9; k > digits[i] - '0'; k--) {
	                if (last[k] > i) {
	                    char temp = digits[i];
	                    digits[i] = digits[last[k]];
	                    digits[last[k]] = temp;
	                    int swapped = Integer.parseInt(new String(digits));
	                    return swapped;
	                }
	            }
	        }
	        return num;
	    }
	}
}
