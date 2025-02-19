package Top150;

import java.util.LinkedList;
import java.util.Queue;

public class Top95 {
    class Solution {
        private int[] getPosition(int cell, int n) {
            int row = (cell - 1) / n;
            int col = (cell - 1) % n;
            int realR = n - 1 - row;
            int realC = (row % 2 == 0) ? col : (n - 1 - col);
            return new int[]{realR, realC};
        }

        public int snakesAndLadders(int[][] board) {
            int n = board.length;
            boolean[] visited = new boolean[n * n + 1];
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{1, 0});

            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int cell = curr[0];
                int moves = curr[1];

                if (cell == n * n) {
                    return moves;
                }

                for (int dice = 1; dice <= 6; dice++) {
                    int next = cell + dice;

                    if (next > n * n) {
                        break;
                    }

                    int[] position = getPosition(next, n);
                    int r = position[0];
                    int c = position[1];

                    if (board[r][c] != -1) {
                        next = board[r][c];
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(new int[]{next, moves + 1});
                    }
                }
            }
            return -1;
        }
    }
}
