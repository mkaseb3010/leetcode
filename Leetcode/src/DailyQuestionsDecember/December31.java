package DailyQuestionsDecember;

public class December31 {
    class Solution {
        public int mincostTickets(int[] days, int[] costs) {
            int n = days.length;
            int[] dp = new int[days[n - 1] + 1];
            boolean[] travel = new boolean[days[n - 1] + 1];
    
            for (int day : days) {
                travel[day] = true;
            }
    
            for (int i = 1; i <= days[n - 1]; i++) {
                if (!travel[i]) {
                    dp[i] = dp[i - 1];
                }else {
                    dp[i] = Math.min(
                        dp[i - 1] + costs[0],
                        Math.min(dp[Math.max(0, i - 7)] + costs[1],
                        dp[Math.max(0, i - 30)] + costs[2]));
                }
            }
            return dp[days[n - 1]];
        }
    }
}
