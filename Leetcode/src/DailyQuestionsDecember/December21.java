package DailyQuestionsDecember;

import java.util.ArrayList;
import java.util.List;

public class December21 {
    class Solution {
        private int dfs(int node, int parent, List<List<Integer>> graph, int[] values, int k, int[] result) {
            int sum = values[node];

            for (int neighbor : graph.get(node)) {
                if (neighbor != parent) {
                    sum += dfs(neighbor, node, graph, values, k , result);
                }
            }

            if (sum % k == 0) {
                result[0]++;
                return 0;
            }
            return sum % k;
        }

        public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }

            int[] result = new int[1];
            dfs(0, -1, graph, values, k, result);
            return result[0];
        }
    }
}
