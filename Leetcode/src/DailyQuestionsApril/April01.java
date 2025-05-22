package DailyQuestionsApril;

public class April01 {
    class Solution {
        public long mostPoints(int[][] questions) {
            int n = questions.length;
            long[] dp = new long[n + 1];

            for (int i = n - 1; i >= 0; i--) {
                int points = questions[i][0];
                int jump = questions[i][1];
                int next = i + jump + 1;
                long solve = points + (next < n ? dp[next] : 0);
                long skip = dp[i + 1];
                dp[i] = Math.max(solve, skip);
            }
            return dp[0];
        }
    }
}
