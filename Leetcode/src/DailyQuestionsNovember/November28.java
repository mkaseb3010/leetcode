package DailyQuestionsNovember;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class November28 {
    public class Solution {
        public int minimumObstacles(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            Deque<int[]> deque = new ArrayDeque<>();
            deque.offer(new int[]{0,0});
            int[][] dist = new int[rows][cols];

            for (int[] row : dist) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }

            dist[0][0] = 0;

            while(!deque.isEmpty()) {
                int[] curr = deque.poll();
                int x = curr[0];
                int y = curr[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx < 0 || nx >= rows || ny < 0 || ny >= cols) {
                        continue;
                    }

                    int newCost = dist[x][y] + grid[nx][ny];

                    if (newCost < dist[nx][ny]) {
                        dist[nx][ny] = newCost;
                        if (grid[nx][ny] == 0) {
                            deque.offerFirst(new int[]{nx, ny});
                        }else {
                            deque.offerLast(new int[]{nx, ny});
                        }
                    }
                }
            }
            return dist[rows - 1][cols - 1];
        }
    }
}
