package DailyQuestionsApril;

public class April02 {
    class Solution {
        public long maximumTripletValue(int[] nums) {
            int n = nums.length;
            int max = nums[0];
            int maxDiff = Integer.MIN_VALUE;
            long result = 0;

            for (int j = 1; j < n - 1; j++) {
                maxDiff = Math.max(maxDiff, max - nums[j]);
                result = Math.max(result, (long) maxDiff * nums[j + 1]);
                max = Math.max(max, nums[j]);
            }
            return result;
        }
    }
}
