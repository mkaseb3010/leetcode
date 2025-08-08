public class May26 {
    class Solution {
        public int largestPathValue(String colors, int[][] edges) {
            int n = colors.length();
            List<Integer>[] graph = new ArrayList[n];
            int[] inDegree = new int[n];

            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int[] e : edges) {
                graph[e[0]].add(e[1]);
                inDegree[e[1]]++;
            }

            int[][] count = new int[n][26];
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            int seen = 0;
            int max = 0;

            while(!queue.isEmpty()) {
                int node = queue.poll();
                seen++;
                int color = colors.charAt(node) - 'a';
                count[node][color]++;
                max = Math.max(max, count[node][color]);

                for (int neighbor : graph[node]) {
                    for (int c = 0; c < 26; c++) {
                        count[neighbor][c] = Math.max(count[neighbor][c], count[node][c]);
                    }

                    if (--inDegree[neighbor] == 0) {
                        queue.offer(neighbor);
                    }
                }
            }
            return seen == n ? max : -1;
        }
    }
}
