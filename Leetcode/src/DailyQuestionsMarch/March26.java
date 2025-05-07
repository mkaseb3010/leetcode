package DailyQuestionsMarch;

import java.util.*;

public class March26 {
    class Solution {
        public int minOperations(int[][] grid, int x) {
            List<Integer> values = new ArrayList<>();
    
            for (int[] row : grid) {
                for (int val : row) {
                    values.add(val);
                }
            }
    
            int base = values.get(0);
            for (int val : values) {
                if (Math.abs(val - base) % x != 0) {
                    return -1;
                }
            }
    
            Collections.sort(values);
            int median = values.get(values.size() / 2);
            int ops = 0;
            for (int val : values) {
                ops += Math.abs(val - median) / x;
            }
            return ops;
        }
    }
}
