package DailyQuestionJanuary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class January31 {
    class Solution {
        private int dfs(int[][] grid, int i, int j, int islandid) {
            int n = grid.length;

            if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 1) {
                return 0;
            }

            grid[i][j] = islandid;
            int size = 1;
            size += dfs(grid, i + 1, j, islandid);
            size += dfs(grid, i - 1, j, islandid);
            size += dfs(grid, i, j + 1, islandid);
            size += dfs(grid, i, j - 1, islandid);
            return size;
        }

        public int largestIsland(int[][] grid) {
            int n = grid.length;
            Map<Integer, Integer> isSize = new HashMap<>();
            int islandid = 2;
            int maxIs = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        int size = dfs(grid, i, j, islandid);
                        isSize.put(islandid, size);
                        maxIs = Math.max(maxIs, size);
                        islandid++;
                    }
                }
            }

            boolean hasZero = false;
            int[] directions = {-1, 0, 1, 0, -1};

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0) {
                        hasZero = true;
                        Set<Integer> seen = new HashSet<>();
                        int newSize = 1;

                        for (int d = 0; d < 4; d++) {
                            int ni = i + directions[d];
                            int nj = j + directions[d + 1];

                            if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] > 1) {
                                int id = grid[ni][nj];

                                if (!seen.contains(id)) {
                                    newSize += isSize.get(id);
                                    seen.add(id);
                                }
                            }
                        }
                        maxIs = Math.max(maxIs, newSize);
                    }
                }
            }
            return hasZero ? maxIs : n * n;
        }
    }
}
