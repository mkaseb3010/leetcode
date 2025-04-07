package DailyQuestionsMarch;

public class March22 {
    class Solution {
        private void dfs(int node, List<Integer>[] graph, boolean[] visited, int[] count) {
            visited[node] = true;
            count[0]++;
            count[1] += graph[node].size();
    
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    dfs(neighbor, graph, visited, count);
                }
            }
        }
    
        public int countCompleteComponents(int n, int[][] edges) {
            List<Integer>[] graph = new ArrayList[n];
            boolean[] visited = new boolean[n];
    
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
    
            for (int[] edge : edges) {
                graph[edge[0]].add(edge[1]);
                graph[edge[1]].add(edge[0]);
            }
    
            int complete = 0;
    
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    int[] count = new int[2];
                    dfs(i, graph, visited, count);
    
                    if (count[1] / 2 == count[0] * (count[0] - 1) / 2) {
                        complete++;
                    }
                }
            }
            return complete;
        }
    }
}
