package DailyQuestionsNovember;

public class October18 {
	public class Solution {
	    private int maxOrVal;
	    private int count;

	    private void backtrack(int[] nums, int index, int currOr) {
	        if (index == nums.length) {
	            if (currOr == maxOrVal) {
	                count++;
	            }
	            return;
	        }
	        backtrack(nums, index + 1, currOr | nums[index]);
	        backtrack(nums, index + 1, currOr);
	    }

	    public int countMaxOrSubsets(int[] nums) {
	        maxOrVal = 0;
	        count = 0;

	        for (int num : nums) {
	            maxOrVal |= num;
	        }

	        backtrack(nums, 0, 0);
	        return count;
	    }
	}
}
