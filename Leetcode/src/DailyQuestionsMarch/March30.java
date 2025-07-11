package DailyQuestionsMarch;

import java.util.*;

public class March30 {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> result = new ArrayList<>();
            int[] last = new int[26];
    
            for (int i = 0; i < s.length(); i++) {
                last[s.charAt(i) - 'a'] = i;
            }
    
            int start = 0;
            int end = 0;
    
            for (int i = 0; i < s.length(); i++) {
                end = Math.max(end, last[s.charAt(i) - 'a']);
                if (i == end) {
                    result.add(end - start + 1);
                    start = i + 1;
                }
            }
            return result;
        }
    }
}
