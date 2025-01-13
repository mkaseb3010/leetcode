package DailyQuestionsNovember;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class November30 {
    public class Solution {
        public int[][] validArrangement(int[][] pairs) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            Map<Integer, Integer> inDegree = new HashMap<>();
            Map<Integer, Integer> outDegree = new HashMap<>();

            for (int[] pair : pairs) {
                int start = pair[0];
                int end = pair[1];

                graph.putIfAbsent(start, new ArrayList<>());
                graph.get(start).add(end);
                outDegree.put(start, outDegree.getOrDefault(start, 0) + 1);
                inDegree.put(end, inDegree.getOrDefault(end, 0) + 1);
            }

            int startNode = pairs[0][0];
            for (int key : graph.keySet()) {
                if (outDegree.getOrDefault(key, 0) > inDegree.getOrDefault(key, 0)) {
                    startNode = key;
                    break;
                }
            }

            List<int[]> result = new ArrayList<>();
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(startNode);

            while(!stack.isEmpty()) {
                int node = stack.peek();
                if (graph.containsKey(node) && !graph.get(node).isEmpty()) {
                    int next = graph.get(node).remove(graph.get(node).size() - 1);
                    stack.push(next);
                }else {
                    stack.pop();
                    if(!stack.isEmpty()) {
                        result.add(new int[]{stack.peek(), node});
                    }
                }
            }
            Collections.reverse(result);
            return result.toArray(new int[result.size()][]);
        }
    }
}
