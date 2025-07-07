package DailyQuestionsApril;

public class April03 {
    class Solution {
        public long maximumTripletValue(int[] nums) {
            int n = nums.length;
            int[] maxPre = new int[n];
            
            maxPre[0] = nums[0];

            for (int i = 1; i < n; i++) {
                maxPre[i] = Math.max(maxPre[i - 1], nums[i]);
            }

            long maxVal = 0;
            int maxSuff = nums[n - 1];

            for (int j = n - 2; j >= 1; j--) {
                maxSuff = Math.max(maxSuff, nums[j + 1]);
                
                int leftMax = maxPre[j - 1];
                long val = (long) (leftMax - nums[j]) * maxSuff;
                maxVal = Math.max(maxVal, val);
            }
            return maxVal;
        }
    }
}
