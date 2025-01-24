package DailyQuestionsDecember;

public class December26 {
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int total = 0;
    
            for (int num : nums) {
                total += num;
            }
    
            if (total < Math.abs(target) || (total + target) % 2 != 0) {
                return 0;
            }
    
            int subset = (total + target) / 2;
            int[] dp = new int[subset + 1];
            dp[0] = 1;
    
            for (int num : nums) {
                for (int j = subset; j >= num; j--) {
                    dp[j] += dp[j - num];
                }
            }
            return dp[subset];
        }
    }
}
