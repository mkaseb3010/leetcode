package DailyQuestionsMarch;

import java.util.*;

public class March23 {
    class Solution {
        public int countPaths(int n, int[][] roads) {
            List<List<int[]>> graph = new ArrayList<>();
    
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
    
            for (int[] road : roads) {
                graph.get(road[0]).add(new int[]{road[1], road[2]});
                graph.get(road[1]).add(new int[]{road[0], road[2]});
            }
    
            int MOD = 1_000_000_007;
            long[] dist = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            dist[0] = 0;
    
            int[] ways = new int[n];
            ways[0] = 1;
            PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
            pq.offer(new long[]{0, 0});
    
            while (!pq.isEmpty()) {
                long[] curr = pq.poll();
                long time = curr[0];
                int node = (int) curr[1];
    
                if (time > dist[node]) {
                    continue;
                }
    
                for (int[] nei : graph.get(node)) {
                    int next = nei[0];
                    long t = nei[1];
    
                    if (dist[next] > time + t) {
                        dist[next] = time + t;
                        ways[next] = ways[node];
                        pq.offer(new long[]{dist[next], next});
                    }else if (dist[next] == time + t) {
                        ways[next] = (ways[next] + ways[node]) % MOD;
                    }
                }
            }
            return ways[n - 1];
        }
    }
}
