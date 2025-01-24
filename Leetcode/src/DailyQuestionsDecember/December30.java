package DailyQuestionsDecember;

public class December30 {
    class Solution {
        public int countGoodStrings(int low, int high, int zero, int one) {
            int mod = 1_000_000_007;
            int[] dp = new int[high + 1];
            dp[0] = 1;
    
            for (int i = 1; i <= high; i++) {
                if (i >= zero) {
                    dp[i] += dp[i - zero];
                    dp[i] %= mod;
                }
    
                if (i >= one) {
                    dp[i] += dp[i - one];
                    dp[i] %= mod;
                }
            }
    
            int result = 0;
    
            for (int i = low; i <= high; i++) {
                result += dp[i];
                result %= mod;
            }
            return result;
        }
    }
}
