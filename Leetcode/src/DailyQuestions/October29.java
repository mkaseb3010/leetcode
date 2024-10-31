package DailyQuestions;

public class October29 {
    public class Solution {
        public int maxMoves(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int[][] dp = new int[rows][cols];
            int res = 0; 
    
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    int diagonalUp = 0, right = 0, diagonalDown = 0;
                    if (row > 0 && col < cols - 1 && grid[row - 1][col + 1] > grid[row][col]) {
                        diagonalUp = 1 + dp[row - 1][col + 1];
                    }
                    if (col < cols - 1 && grid[row][col + 1] > grid[row][col]) {
                        right = 1 + dp[row][col + 1];
                    }
                    if (row < rows - 1 && col < cols - 1 && grid[row + 1][col + 1] > grid[row][col]) {
                        diagonalDown = 1 + dp[row + 1][col + 1];
                    }
    
                    dp[row][col] = Math.max(diagonalUp, Math.max(right, diagonalDown));
    
                    if (col == 0) {
                        res = Math.max(res, dp[row][col]);
                    }
                }
            }
            return res;
        }
    }
    
}
