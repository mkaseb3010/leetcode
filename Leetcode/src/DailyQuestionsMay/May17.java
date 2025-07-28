package DailyQuestionsMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class May17 {
    class Solution {
        private static final int MOD = 1_000_000_007;

        private void generateValidColumns(int m, List<Integer> current, List<List<Integer>> result) {
            if (current.size() == m) {
                result.add(new ArrayList<>(current));
                return;
            }

            for (int color = 0; color < 3; color++) {
                if (current.isEmpty() || current.get(current.size() - 1) != color) {
                    current.add(color);
                    generateValidColumns(m, current, result);
                    current.remove(current.size() - 1);
                }
            }
        }

        private boolean isCompatible(List<Integer> a, List<Integer> b) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).equals(b.get(i))) return false;
            }
            return true;
        }
        
        public int colorTheGrid(int m, int n) {
            List<List<Integer>> validCols = new ArrayList<>();

            generateValidColumns(m, new ArrayList<>(), validCols);

            int size = validCols.size();
            int[][] transitions = new int[size][size];

            for (int i = 0; i < size; i++) {
                List<Integer> a = validCols.get(i);

                for (int j = 0; j < size; j++) {
                    List<Integer> b = validCols.get(j);

                    if (isCompatible(a, b)) {
                        transitions[i][j] = 1;
                    }
                }
            }

            long[] dp = new long[size];
            Arrays.fill(dp, 1);

            for (int col = 1; col < n; col++) {
                long[] next = new long[size];

                for (int curr = 0; curr < size; curr++) {
                    for (int prev = 0; prev < size; prev++) {
                        if (transitions[prev][curr] == 1) {
                            next[curr] = (next[curr] + dp[prev]) % MOD;
                        }
                    }
                }
                dp = next;
            }

            long total = 0;

            for (long val : dp) {
                total = (total + val) % MOD;
            }
            return (int) total;
        }
    }
}
