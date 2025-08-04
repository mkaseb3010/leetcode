package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 5, 2023.
 * Problem: Domino and Tromino Tiling.
 * Link: https://leetcode.com/problems/domino-and-tromino-tiling/
 */

// Time Complexity: O(n)
// Space Complexity: O(n)

public class May05 {
    public class Solution {
        public int numTilings(int n) {
            int MOD = 1_000_000_007;

            if (n <= 1) {
                return 1;
            }

            if (n == 2) {
                return 2;
            }

            if (n == 3) {
                return 5;
            }

            long[] dp = new long[n + 1];
            dp[0] = 1; dp[1] = 1; dp[2] = 2; dp[3] = 5;

            for (int i = 4; i <= n; i++) {
                dp[i] = (2 * dp[i - 1] % MOD + dp[i - 3]) % MOD;
            }
            return (int) dp[n];
        }
    }
}
