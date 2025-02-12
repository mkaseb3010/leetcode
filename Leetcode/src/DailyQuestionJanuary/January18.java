package DailyQuestionJanuary;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class January18 {
    class Solution {
        public int minCost(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            Deque<int[]> deque = new LinkedList<>();
            int[][] cost = new int[n][m];

            for (int[] row : cost) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }

            deque.addFirst(new int[]{0, 0, 0});
            cost[0][0] = 0;

            while (!deque.isEmpty()) {
                int[] curr = deque.pollFirst();
                int r = curr[0];
                int c = curr[1];
                int currCost = curr[2];

                if (r == n - 1 && c == m - 1) {
                    return currCost;
                }

                for (int d = 0; d < 4; d++) {
                    int nr = r + directions[d][0];
                    int nc = c + directions[d][1];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                        int newCost = currCost + ((d + 1) == grid[r][c] ? 0 : 1);
                        
                        if (newCost < cost[nr][nc]) {
                            cost[nr][nc] = newCost;
                            if (newCost == currCost) {
                                deque.addFirst(new int[]{nr, nc, newCost});
                            }else {
                                deque.addLast(new int[]{nr, nc, newCost});
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }
}
