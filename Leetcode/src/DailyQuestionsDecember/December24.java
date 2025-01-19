package DailyQuestionsDecember;

public class December24 {
    class Solution {
        public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
            Map<Integer, List<Integer>> adjList1 = buildAdjList(edges1);
            Map<Integer, List<Integer>> adjList2 = buildAdjList(edges2);
            PriorityQueue<Integer> diameter1 = calculateTwoLongestDistances(adjList1);
            PriorityQueue<Integer> diameter2 = calculateTwoLongestDistances(adjList2);
            int secondLongest1 = 0, longest1 = 0;
            int secondLongest2 = 0, longest2 = 0;

            if (diameter1.size() == 2) {
                secondLongest1 = diameter1.poll();
                longest1 = diameter1.poll();
            } else if (!diameter1.isEmpty()) {
                longest1 = diameter1.poll();
            }

            if (diameter2.size() == 2) {
                secondLongest2 = diameter2.poll();
                longest2 = diameter2.poll();
            } else if (!diameter2.isEmpty()) {
                longest2 = diameter2.poll();
            }
            return Math.max(secondLongest1 + longest1, Math.max(secondLongest2 + longest2, longest1 + longest2 + 1));
        }

        private PriorityQueue<Integer> calculateTwoLongestDistances(Map<Integer, List<Integer>> adjList) {
            Map<Integer, Integer> indegree = new HashMap<>();
            for (int key : adjList.keySet()) {
                indegree.put(key, adjList.get(key).size());
            }

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> res = new PriorityQueue<>();

            for (int key : adjList.keySet()) {
                if (indegree.get(key) == 1) {
                    queue.add(new int[]{key, 0});
                }
            }

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int node = current[0];
                int dist = current[1];

                for (int adj : adjList.get(node)) {
                    if (indegree.get(adj) > 0) {
                        if (indegree.get(adj) > 1) {
                            indegree.put(adj, indegree.get(adj) - 1);
                        }
                        if (indegree.get(adj) == 1) {
                            queue.add(new int[]{adj, dist + 1});
                            res.add(dist + 1);
                            if (res.size() > 2) {
                                res.poll();
                            }
                        }
                    }
                }
                indegree.put(node, indegree.get(node) - 1);
            }

            if (res.isEmpty()) {
                res.add(0);
            }

            return res;
        }

        private Map<Integer, List<Integer>> buildAdjList(int[][] edges) {
            Map<Integer, List<Integer>> adjList = new HashMap<>();

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                adjList.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
                adjList.computeIfAbsent(v, x -> new ArrayList<>()).add(u);
            }
            return adjList;
        }
    }
}
