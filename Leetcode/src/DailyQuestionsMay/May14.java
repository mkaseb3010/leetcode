package DailyQuestionsMay;

import java.util.List;

/**
 * LeetCode Daily Challenge for May 14, 2025.
 * Problem: Length of String After Transformations.
 * Link: https://leetcode.com/problems/total-characters-in-string-after-transformations-ii/
 */

// Time Complexity: O(t * n)
// Space Complexity: O(n)

public class May14 {
    public class Solution {
        private static final int mod = 1_000_000_007;

        private long[][] multiplyMatrices(long[][] A, long[][] B) {
            int rowsA = A.length;
            int colsA = A[0].length;
            int colsB = B[0].length;
            long[][] result = new long[rowsA][colsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] = (result[i][j] + A[i][k] * B[k][j]) % mod;
                    }
                }
            }
            return result;
        }

        private long[][] powerMatrix(long[][] matrix, long exponent) {
            int n = matrix.length;
            long[][] result = new long[n][n];

            for (int i = 0; i < n; i++) {
                result[i][i] = 1;
            }

            while (exponent > 0) {
                if ((exponent & 1) == 1) {
                    result = multiplyMatrices(result, matrix);
                }
                matrix = multiplyMatrices(matrix, matrix);
                exponent >>= 1;
            }
            return result;
        }

        public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
            long[][] transform = new long[26][26];

            for (int i = 0; i < 26; i++) {
                for (int shift = 0; shift < nums.get(i); shift++) {
                    transform[i][(i + 1 + shift) % 26]++;
                }
            }

            transform = powerMatrix(transform, t);
            long[][] freq = new long[1][26];

            for (char ch : s.toCharArray()) {
                freq[0][ch - 'a']++;
            }

            freq = multiplyMatrices(freq, transform);
            long total = 0;

            for (long cnt : freq[0]) {
                total = (total + cnt) % mod;
            }
            return (int)total;
        }
    }
}
