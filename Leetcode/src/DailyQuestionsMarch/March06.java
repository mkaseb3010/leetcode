package DailyQuestionsMarch;

public class March06 {
    class Solution {
        public int[] findMissingAndRepeatedValues(int[][] grid) {
            int n = grid.length;
            int[] count = new int[n * n + 1];
            int repeated = -1;
            int missing = -1;
    
            for (int[] row : grid) {
                for (int num : row) {
                    count[num]++;
                }
            }
    
            for (int i = 1; i <= n * n; i++) {
                if (count[i] == 2) {
                    repeated = i;
                }
    
                if (count[i] == 0) {
                    missing = i;
                }
            }
            return new int[]{repeated, missing};
        }
    }
}
