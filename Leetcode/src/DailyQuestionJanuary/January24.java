package DailyQuestionJanuary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class January24 {
    class Solution {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int n = graph.length;
            List<List<Integer>> reversed = new ArrayList<>();
            int[] inDegree = new int[n];

            for (int i = 0; i < n; i++) {
                reversed.add(new ArrayList<>());
            }

            for (int i = 0; i < n; i++) {
                for (int neighbor : graph[i]) {
                    reversed.get(neighbor).add(i);
                    inDegree[i]++;
                }
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }

            List<Integer> safe = new ArrayList<>();
            while (!queue.isEmpty()) {
                int node = queue.poll();
                safe.add(node);

                for (int parent : reversed.get(node)) {
                    inDegree[parent]--;
                    if (inDegree[parent] == 0) {
                        queue.add(parent);
                    }
                }
            }
            Collections.sort(safe);
            return safe;
        }
    }
}
