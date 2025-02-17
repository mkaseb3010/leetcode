package DailyQuestionJanuary;

import java.util.ArrayList;
import java.util.List;

public class January10 {
    class Solution {
        private int[] getFrequency(String word) {
            int[] frequency = new int[26];
            for (char ch : word.toCharArray()) {
                frequency[ch - 'a']++;
            }
            return frequency;
        }

        private boolean isUniversal(int[] frequency, int[] maxFrequency) {
            for (int i = 0; i < 26; i++) {
                if (frequency[i] < maxFrequency[i]) {
                    return false;
                }
            }
            return true;
        }

        public List<String> wordSubsets(String[] words1, String[] words2) {
            int[] max = new int[26];

            for (String word : words2) {
                int[] frequency = getFrequency(word);
                for (int i = 0; i < 26; i++) {
                    max[i] = Math.max(max[i], frequency[i]);
                }
            }

            List<String> result = new ArrayList<>();

            for (String word : words1) {
                int[] frequency = getFrequency(word);
                if (isUniversal(frequency, max)) {
                    result.add(word);
                }
            }
            return result;
        }
    }
}
