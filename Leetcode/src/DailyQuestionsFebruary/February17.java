package DailyQuestionsFebruary;

public class February17 {
    class Solution {
        private int backtrack(int[] freq) {
            int count = 0;
    
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    freq[i]--;
                    count += 1 + backtrack(freq);
                    freq[i]++;
                }
            }
            return count;
        }
    
        public int numTilePossibilities(String tiles) {
            int[] freq = new int[26];
    
            for (char ch : tiles.toCharArray()) {
                freq[ch - 'A']++;
            }
            return backtrack(freq);
        }
    }
}
