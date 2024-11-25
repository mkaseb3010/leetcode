import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class November25 {
    public class Solution {
        public int slidingPuzzle(int[][] board) {
            StringBuilder sb = new StringBuilder();
            for (int[] row : board) {
                for (int num : row) {
                    sb.append(num);
                }
            }
            String start = sb.toString();
            String target = "123450";
            int[][] neighbors = {
                {1, 3},
                {0, 2, 4},
                {1, 5}, 
                {0, 4},
                {1, 3, 5},
                {2, 4}
            };
            Queue<String> queue = new LinkedList<>();
            Set<String> visited = new HashSet<>();
            queue.add(start);
            visited.add(start);
            int moves = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String curr = queue.poll();
                    if (curr.equals(target)) {
                        return moves;
                    }

                    int index = curr.indexOf('0');
                    for (int neighbor : neighbors[index]) {
                        char[] ch = curr.toCharArray();
                        ch[index] = ch[neighbor];
                        ch[neighbor] = '0';
                        String next = new String(ch);

                        if (!visited.contains(next)) {
                            queue.add(next);
                            visited.add(next);
                        }
                    }
                }
                moves++;
            }
            return -1;
        }
    }
}
