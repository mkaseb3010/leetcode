package DailyQuestionJanuary;

public class January30 {
    import java.util.*;

    class Solution {
        private boolean bfsCheck(Map<Integer, List<Integer>> graph, int[] colors, int start, List<Integer> component) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            colors[start] = 1;
            component.add(start);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : graph.get(node)) {
                    if (colors[neighbor] == 0) {
                        colors[neighbor] = -colors[node];
                        queue.add(neighbor);
                        component.add(neighbor);
                    } else if (colors[neighbor] == colors[node]) {
                        return false;
                    }
                }
            }
            return true;
        }

        private int bfsMaxLevels(Map<Integer, List<Integer>> graph, List<Integer> component) {
            int maxLevel = 0;
            for (int node : component) {
                maxLevel = Math.max(maxLevel, bfsLevels(graph, node));
            }
            return maxLevel;
        }

        private int bfsLevels(Map<Integer, List<Integer>> graph, int start) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            Set<Integer> visited = new HashSet<>();
            visited.add(start);

            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int node = queue.poll();
                    for (int neighbor : graph.get(node)) {
                        if (!visited.contains(neighbor)) {
                            visited.add(neighbor);
                            queue.add(neighbor);
                        }
                    }
                }
                level++;
            }
            return level;
        }

        public int magnificentSets(int n, int[][] edges) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                graph.put(i, new ArrayList<>());
            }
            for (int[] edge : edges) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }

            int[] colors = new int[n + 1];
            Arrays.fill(colors, 0);
            int maxGroups = 0;

            for (int i = 1; i <= n; i++) {
                if (colors[i] == 0) {
                    List<Integer> component = new ArrayList<>();
                    if (!bfsCheck(graph, colors, i, component)) {
                        return -1;
                    }
                    maxGroups += bfsMaxLevels(graph, component);
                }
            }
            return maxGroups;
        }
    }
}
