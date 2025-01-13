package DailyQuestionsNovember;

import java.util.PriorityQueue;

public class November29 {
    public class Solution {
        public int minimumTime(int[][] grid) {
            int rows = grid.length; 
            int cols = grid[0].length;

            if (grid[0][1] > 1 && grid[1][0] > 1) {
                return -1;
            }

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            pq.offer(new int[]{0, 0, 0}); // {time, x, y}
            boolean[][] visited = new boolean[rows][cols];

            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                int time = current[0]; 
                int x = current[1]; 
                int y = current[2];

                if (x == rows - 1 && y == cols - 1) {
                    return time;
                }

                if (visited[x][y]) {
                    continue;
                }

                visited[x][y] = true;

                for (int[] dir : directions) {
                    int nx = x + dir[0]; 
                    int ny = y + dir[1];

                    if (nx < 0 || ny < 0 || nx >= rows || ny >= cols || visited[nx][ny]) {
                        continue;
                    }

                    int nextTime = time + 1;
                    if (nextTime < grid[nx][ny]) {
                        int diff = grid[nx][ny] - nextTime;
                        if (diff % 2 != 0) {
                            nextTime = grid[nx][ny] + 1;
                        }else {
                            nextTime = grid[nx][ny];
                        }
                    }
                    pq.offer(new int[]{nextTime, nx, ny});
                }
            }
            return -1;
        }
    }
}
