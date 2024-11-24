package DailyQuestionsNovember;

import java.util.HashMap;
import java.util.Map;

public class November22 {
    public class Solution {
        public int maxEqualRowsAfterFlips(int[][] matrix) {
            Map<String, Integer> patternMap = new HashMap<>();

            for (int[] row : matrix) {
                StringBuilder pattern = new StringBuilder();
                StringBuilder complement = new StringBuilder();

                for (int cell : row) {
                    pattern.append(cell == row[0] ? '0' : '1');
                    complement.append(cell == row[0] ? '1' : '0');
                }

                String patternStr = pattern.toString();
                patternMap.put(patternStr, patternMap.getOrDefault(patternStr, 0) + 1);
            }
            
            int max = 0;
            for (int count : patternMap.values()) {
                max = Math.max(max, count);
            }
            return max;
        }
    }
}
