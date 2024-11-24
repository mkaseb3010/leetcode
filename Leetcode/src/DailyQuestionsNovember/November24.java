package DailyQuestionsNovember;

public class November24 {
    public class Solution {
        public long maxMatrixSum(int[][] matrix) {
            int n = matrix.length;
            long total = 0;
            int min = Integer.MAX_VALUE;
            int negativeCount = 0;
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int val = matrix[i][j];
                    total += Math.abs(val);
                    min = Math.min(min, Math.abs(val));
                    if (val < 0) {
                        negativeCount++;
                    }
                }
            }  
    
            if (negativeCount % 2 != 0) {
                total -= 2 * min;
            } 
            return total;
        }
    }
}
