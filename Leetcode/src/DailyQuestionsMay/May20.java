package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 20, 2023.
 * Problem: Zero Array.
 * Link: https://leetcode.com/problems/zero-array/
 */

// Time Complexity: O(n + q)
// Space Complexity: O(n)

public class May20 {
    class Solution {
        public boolean isZeroArray(int[] nums, int[][] queries) {
            int n = nums.length;
            int[] freq = new int[n + 1];

            for (int[] q : queries) {
                int left = q[0];
                int right = q[1];
                freq[left]++;

                if (right + 1 < n) {
                    freq[right + 1]--;
                }
            }

            for (int i = 1; i < n; i++) {
                freq[i] += freq[i - 1];
            }

            for (int i = 0; i < n; i++) {
                if (freq[i] < nums[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
