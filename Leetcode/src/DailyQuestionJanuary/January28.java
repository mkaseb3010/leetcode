package DailyQuestionJanuary;

public class January28 {
    class Solution {
        private int dfs(int[][] grid, int r, int c) {
            if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
                return 0;
            }
    
            int count = grid[r][c];
            grid[r][c] = 0;
    
            count += dfs(grid, r + 1, c);
            count += dfs(grid, r - 1, c);
            count += dfs(grid, r, c + 1);
            count += dfs(grid, r, c - 1);
    
            return count;
        }
    
        public int findMaxFish(int[][] grid) {
            int max = 0;
            int rows = grid.length;
            int cols = grid[0].length;
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] > 0) {
                        max = Math.max(max, dfs(grid, i, j));
                    }
                }
            }
            return max;
        }
    }
}
