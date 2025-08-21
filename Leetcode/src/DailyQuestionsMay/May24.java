package DailyQuestionsMay;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Daily Challenge for May 24, 2025.
 * Problem: Find Words Containing Character.
 * Link: https://leetcode.com/problems/find-words-containing-character/
 */

// Time Complexity: O(n * m)
// Space Complexity: O(n)

public class May24 {
    public class Solution {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                if (words[i].indexOf(x) != -1) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}
