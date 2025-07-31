package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 11, 2023.
 * Problem: Three Consecutive Odds.
 * Link: https://leetcode.com/problems/three-consecutive-odds/
 */

// Time Complexity: O(n)
// Space Complexity: O(1)

public class May11 {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            int count = 0;

            for (int num : arr) {
                if (num % 2 != 0) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }else {
                    count = 0;
                }
            }

            return false;
        }
    }
}
