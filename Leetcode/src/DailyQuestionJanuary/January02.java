package DailyQuestionJanuary;

public class January02 {
    class Solution {
        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    
        public int[] vowelStrings(String[] words, int[][] queries) {
            int n = words.length;
            int[] prefixSum = new int[n + 1];
    
            for (int i = 0; i < n; i++) {
                String word = words[i];
                if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                    prefixSum[i + 1] = prefixSum[i] + 1;
                }else {
                    prefixSum[i + 1] = prefixSum[i];
                }
            }
    
            int[] result = new int[queries.length];
    
            for (int i = 0; i < queries.length; i++) {
                int left = queries[i][0];
                int right = queries[i][1];
                result[i] = prefixSum[right + 1] - prefixSum[left];
            }
            return result;
        }
    }
}
