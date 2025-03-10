package Top150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Top92 {
    class Solution {
        private double dfs(Map<String, Map<String, Double>> graph, String current, String target, Set<String> visited) {
            if (current.equals(target)) {
                return 1.0;
            }

            visited.add(current);

            for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
                if (!visited.contains(neighbor.getKey())) {
                    double result = dfs(graph, neighbor.getKey(), target, visited);
                    if (result != -1.0) {
                        return result * neighbor.getValue();
                    }
                }
            }
            return -1.0;
        }

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            Map<String, Map<String, Double>> graph = new HashMap<>();

            for (int i = 0; i < equations.size(); i++) {
                String u = equations.get(i).get(0);
                String v = equations.get(i).get(1);
                double val = values[i];

                graph.putIfAbsent(u, new HashMap<>());
                graph.putIfAbsent(v, new HashMap<>());
                graph.get(u).put(v, val);
                graph.get(v).put(u, 1.0 / val);
            }

            double[] result = new double[queries.size()];

            for (int i = 0; i < queries.size(); i++) {
                String start = queries.get(i).get(0);
                String end = queries.get(i).get(1);

                if (!graph.containsKey(start) || !graph.containsKey(end)) {
                    result[i] = -1.0;
                }else if (start.equals(end)) {
                    result[i] = 1.0;
                }else {
                    Set<String> visited = new HashSet<>();
                    result[i] = dfs(graph, start, end, visited);
                }
            }
            return result;
        }
    }
}
