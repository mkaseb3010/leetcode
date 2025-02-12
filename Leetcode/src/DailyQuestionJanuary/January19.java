package DailyQuestionJanuary;

import java.util.Comparator;
import java.util.PriorityQueue;

public class January19 {
    class Solution {
        public int trapRainWater(int[][] heightMap) {
            int n = heightMap.length;
            int m = heightMap[0].length;
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
            boolean[][] visited = new boolean[n][m];
            int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

            for (int i = 0; i < n; i++) {
                pq.add(new int[]{i, 0, heightMap[i][0]});
                pq.add(new int[]{i, m - 1, heightMap[i][m - 1]});
                visited[i][0] = visited[i][m - 1] = true;
            }

            for (int j = 1; j < m - 1; j++) {
                pq.add(new int[]{0, j, heightMap[0][j]});
                pq.add(new int[]{n - 1, j, heightMap[n - 1][j]});
                visited[0][j] = visited[n - 1][j] = true;
            }

            int trapped = 0;

            while (!pq.isEmpty()) {
                int[] cell = pq.poll();
                int r = cell[0];
                int c = cell[1];
                int minHeight = cell[2];

                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        if (heightMap[nr][nc] < minHeight) {
                            trapped += minHeight - heightMap[nr][nc];
                        }
                        pq.add(new int[]{nr, nc, Math.max(heightMap[nr][nc], minHeight)});
                    }
                }
            }
            return trapped;
        }
    }
}
