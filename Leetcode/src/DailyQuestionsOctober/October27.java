package DailyQuestionsOctober;

public class October27 {
    public class Solution {
        public int countSquares(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] mat = new int[rows][cols];
            int total = 0;
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == 1) {
                        if (i == 0 || j == 0) {
                            mat[i][j] = 1;
                        }else {
                            mat[i][j] = 1 + Math.min(mat[i - 1][j], Math.min(mat[i][j - 1], mat[i - 1][j - 1]));
                        }
                        total += mat[i][j];
                    }
                }
            }
            return total;
        }
    }
}
