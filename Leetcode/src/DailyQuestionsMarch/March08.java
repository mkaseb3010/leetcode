package DailyQuestionsMarch;

public class March08 {
    class Solution {
        public int minimumRecolors(String blocks, int k) {
            int min = Integer.MAX_VALUE;
            int count = 0;
    
            for (int i = 0; i < k; i++) {
                if (blocks.charAt(i) == 'W') {
                    count++;
                }
            }
    
            min = count;
    
            for (int i = k; i < blocks.length(); i++) {
                if (blocks.charAt(i - k) == 'W') {
                    count--;
                }
    
                if (blocks.charAt(i) == 'W') {
                    count++;
                }
    
                min = Math.min(min, count);
            }
            return min;
        }
    }
}
