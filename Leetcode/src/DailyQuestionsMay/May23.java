package DailyQuestionsMay;

public class May23 {
    class Solution {
        public long maximumValueSum(int[] nums, int k, int[][] edges) {
            long[] dp = {0, Long.MIN_VALUE};

            for (int n : nums) {
                long count1 = dp[0] + n;
                long count2 = dp[1] + n;
                int x = n ^ k;
                dp = new long[]{ Math.max(count1, dp[1] + x), Math.max(count2, dp[0] + x) };
            }
            return dp[0];
        }
    }
}
