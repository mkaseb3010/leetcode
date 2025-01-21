package DailyQuestionsDecember;

public class December29 {
    class Solution {
        public int numWays(String[] words, String target) {
            int mod = 1_000_000_007;
            int m = target.length();
            int n = words[0].length();
            int[][] freq = new int[26][n];
    
            for (String word : words) {
                for (int j = 0; j < n; j++) {
                    freq[word.charAt(j) - 'a'][j]++;
                }
            }
    
            long[] dp = new long[m + 1];
            dp[0] = 1;
    
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    int targetCh = target.charAt(i) - 'a';
                    dp[i + 1] += dp[i] * freq[targetCh][j];
                    dp[i + 1] %= mod;
                }
            }
            return (int) dp[m];
        }
    }
}
