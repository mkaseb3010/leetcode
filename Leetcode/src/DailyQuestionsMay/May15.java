package DailyQuestionsMay;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Daily Challenge for May 15, 2025.
 * Problem: Longest Subsequence with Distinct Groups.
 * Link: https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/
 */

// Time Complexity: O(n)
// Space Complexity: O(n)

public class May15 {
    public class Solution {
        public List<String> getLongestSubsequence(String[] words, int[] groups) {
            List<String> result = new ArrayList<>();

            if (words.length == 0) {
                return result;
            }

            result.add(words[0]);
            int lastGroup = groups[0];

            for (int i = 1; i < words.length; i++) {
                if (groups[i] != lastGroup) {
                    result.add(words[i]);
                    lastGroup = groups[i];
                }
            }
            return result;
        }
    }
}
