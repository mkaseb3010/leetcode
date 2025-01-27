package DailyQuestionJanuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class January07 {
    class Solution {
        public List<String> stringMatching(String[] words) {
            HashSet<String> subString = new HashSet<>();

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (i != j && words[j].contains(words[i])) {
                        subString.add(words[i]);
                    }
                }
            }
            return new ArrayList<>(subString);
        }
    }
}
