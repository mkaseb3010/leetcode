package DailyQuestionsNovember;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class November26 {
    public class Solution {
        private void dfs(int node, Map<Integer, List<Integer>> graph, boolean[] visited) {
            visited[node] = true;

            if (!graph.containsKey(node)) {
                return;
            }

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) dfs(neighbor, graph, visited);
            }
        }
        
        public int findChampion(int n, int[][] edges) {
            int[] inDegree = new int[n];
            Map<Integer, List<Integer>> graph = new HashMap<>();

            for (int[] edge : edges) {
                int from = edge[0];
                int to = edge[1];
                inDegree[to]++;
                graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
            }

            int candidate = -1;
            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    if (candidate != -1) {
                        return -1;
                    }
                    candidate = i;
                }
            }

            if (candidate == -1){
                return -1;
            }

            boolean[] visited = new boolean[n];
            dfs(candidate, graph, visited);

            for (int i = 0; i < n; i++) {
                if (!visited[i] && i != candidate) {
                    return -1;
                }
            }
            return candidate;
        }
    }
}
