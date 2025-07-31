package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 21, 2023.
 * Problem: Set Matrix Zeroes.
 * Link: https://leetcode.com/problems/set-matrix-zeroes/
 */

// Time Complexity: O(m * n)
// Space Complexity: O(1)

public class May21 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean firstRowZero = false;
            boolean firstColZero = false;

            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            if (firstRowZero) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            if (firstColZero) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }
}
