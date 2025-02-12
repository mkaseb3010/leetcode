package DailyQuestionJanuary;

public class January04 {
    class Solution {
        public int countPalindromicSubsequence(String s) {
            int n = s.length();
            int[] left = new int[26];
            int[] right = new int[26];
            boolean[][] seen = new boolean[26][26];
    
            for (char ch : s.toCharArray()) {
                right[ch - 'a']++;
            }
    
            int count = 0;
    
            for (int i = 0; i < n; i++) {
                char mid = s.charAt(i);
                right[mid - 'a']--;
                for (int k = 0; k < 26; k++) {
                    if (left[k] > 0 && right[k] > 0 && !seen[k][mid - 'a']) {
                        seen[k][mid - 'a'] = true;
                        count++;
                    }
                }
                left[mid - 'a']++;
            }
            return count;
        }
    }
}
