package Top150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top32 {
    public class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> result = new ArrayList<>();
            if (s == null || words == null || words.length == 0) {
                return result;
            }

            int wordLen = words[0].length();
            int num = words.length;
            int conc = wordLen * num;

            if (s.length() < conc) {
                return result;
            }

            Map<String, Integer> wordMap = new HashMap<>();
            for (String word : words) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }

            for (int i = 0; i < wordLen; i++) {
                int left = i;
                int right = i;
                int count = 0;
                Map<String, Integer> seenMap = new HashMap<>();

                while (right + wordLen <= s.length()) {
                    String word = s.substring(right, right + wordLen);
                    right += wordLen;

                    if (wordMap.containsKey(word)) {
                        seenMap.put(word, seenMap.getOrDefault(word, 0) + 1);
                        count++;

                        while (seenMap.get(word) > wordMap.get(word)) {
                            String leftWord = s.substring(left, left + wordLen);
                            seenMap.put(leftWord, seenMap.get(leftWord) - 1);
                            count--;
                            left += wordLen;
                        }

                        if (count == num) {
                            result.add(left);
                        }
                    } else {
                        seenMap.clear();
                        count = 0;
                        left = right;
                    }
                }
            }
            return result;
        }
    }
}
