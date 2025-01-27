package DailyQuestionJanuary;

public class January08 {
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {
            int count = 0;
    
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    String pre = words[i];
                    String suf = words[i];
                    String tar = words[j];
    
                    if (tar.startsWith(pre) && tar.endsWith(suf)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
