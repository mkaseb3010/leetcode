package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 4, 2023.
 * Problem: Number of Equivalent Domino Pairs.
 * Link: https://leetcode.com/problems/number-of-equivalent-domino-pairs/
 */

// Time Complexity: O(n)
// Space Complexity: O(1)

public class May04 {
    public class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[] mpp = new int[100];

            for (int[] d : dominoes) {
                if (d[0] > d[1]) {
                    mpp[d[0] * 10 + d[1]]++;
                }else {
                    mpp[d[1] * 10 + d[0]]++;
                }
            }

            int count = 0;

            for (int freq : mpp) {
                count += (freq - 1) * freq / 2;
            }
            return count;
        }
    }
}
