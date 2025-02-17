package DailyQuestionJanuary;

import java.util.HashMap;
import java.util.Map;

public class January20 {
    class Solution {
        public int firstCompleteIndex(int[] arr, int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            Map<Integer, int[]> pos = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pos.put(mat[i][j], new int[]{i, j});
                }
            }

            int[] row = new int[n];
            int[] col = new int[m];

            for (int i = 0; i < arr.length; i++) {
                int[] position = pos.get(arr[i]);
                int r = position[0];
                int c = position[1];

                row[r]++;
                col[c]++;

                if (row[r] == m || col[c] == n) {
                    return i;
                }
            }
            return -1;
        }
    }
}
