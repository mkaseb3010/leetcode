package DailyQuestionsMarch;

import java.util.*;

public class March28 {
    class Solution {
        public int[] maxPoints(int[][] grid, int[] queries) {
            int m = grid.length;
            int n = grid[0].length;
            int[] res = new int[queries.length];
            int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
            boolean[][] visited = new boolean[m][n];
            int[][] queryPairs = new int[queries.length][2];
    
            for (int i = 0; i < queries.length; i++) {
                queryPairs[i][0] = queries[i];
                queryPairs[i][1] = i;
            }
    
            Arrays.sort(queryPairs, Comparator.comparingInt(a -> a[0]));
            
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.offer(new int[]{grid[0][0], 0, 0});
            visited[0][0] = true;
            int count = 0;
            int[][] seen = new int[m][n];
            int idx = 0;
            
            for (int[] pair : queryPairs) {
                int val = pair[0], qi = pair[1];
                
                while (!pq.isEmpty() && pq.peek()[0] < val) {
                    int[] top = pq.poll();
                    int r = top[1], c = top[2];
                    count++;
                    
                    for (int[] d : dirs) {
                        int nr = r + d[0], nc = c + d[1];
                        if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                            visited[nr][nc] = true;
                            pq.offer(new int[]{grid[nr][nc], nr, nc});
                        }
                    }
                }
                res[qi] = count;
            }
            return res;
        }
    }    
}
