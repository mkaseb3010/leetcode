package DailyQuestionJanuary;

public class January11 {
    class Solution {
        public boolean canConstruct(String s, int k) {
            if (k > s.length()) {
                return false;
            }
    
            int[] charCount = new int[26];
    
            for (char ch : s.toCharArray()) {
                charCount[ch - 'a']++;
            }
    
            int odd = 0;
    
            for (int count : charCount) {
                if (count % 2 != 0) {
                    odd++;
                }
            }
            return odd <= k;
        }
    }
}
