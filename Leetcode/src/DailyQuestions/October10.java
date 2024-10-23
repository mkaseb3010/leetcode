package DailyQuestions;
import java.util.*;

public class October10 {
	public class Solution {
	    public int maxWidthRamp(int[] nums) {
	        Stack<Integer> stack = new Stack<>();
	        int n = nums.length;

	        for (int i = 0; i < n; i++) {
	            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
	                stack.push(i);
	            }
	        }

	        int max = 0;
	        for (int j = n - 1; j >= 0; j--) {
	            while (!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {
	                max = Math.max(max, j - stack.pop());
	            }
	        }
	        return max;
	    }
	}
}
