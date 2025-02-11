package DailyQuestionJanuary;

public class January01 {
    class Solution {
        public int maxScore(String s) {
            int n = s.length();
            int[] leftZeros = new int[n];
            int[] rightOnes = new int[n];
    
            leftZeros[0] = (s.charAt(0) == '0') ? 1 : 0;
            for (int i = 1; i < n; i++) {
                leftZeros[i] = leftZeros[i - 1] + (s.charAt(i) == '0' ? 1 : 0);
            }
    
            rightOnes[n - 1] = (s.charAt(n - 1) == '1') ? 1 : 0;
            for (int i = n - 2; i >= 0; i--) {
                rightOnes[i] = rightOnes[i + 1] + (s.charAt(i) == '1' ? 1 : 0);
            }
    
            int max = 0;
    
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(max, leftZeros[i] + rightOnes[i + 1]);
            }
            return max;
        }
    }
}
