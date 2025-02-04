package DailyQuestionJanuary;

public class January21 {
    class Solution {
        public long gridGame(int[][] grid) {
            int n = grid[0].length;
            long[] preTop = new long[n + 1];
            long[] preBottom = new long[n + 1];
    
            for (int i = 0; i < n; i++) {
                preTop[i + 1] = preTop[i] + grid[0][i];
                preBottom[i + 1] = preBottom[i] + grid[1][i];
            }
    
            long points = Long.MAX_VALUE;
    
            for (int i = 0; i < n; i++) {
                long pointsA = preTop[n] - preTop[i + 1];
                long pointsB = preBottom[i];
                long pointsC = Math.max(pointsA, pointsB);
                points = Math.min(points, pointsC);
            }
            return points;
        }
    }
}
