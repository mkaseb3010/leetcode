package DailyQuestionJanuary;

public class January06 {
    class Solution {
        public int[] minOperations(String boxes) {
            int n = boxes.length();
            int[] result = new int[n];
            int count = 0;
            int op = 0;
    
            for (int i = 0; i < n; i++) {
                result[i] += op;
                count += boxes.charAt(i) - '0';
                op += count;
            }
    
            count = 0;
            op = 0;
    
            for (int i = n - 1; i >= 0; i--) {
                result[i] += op;
                count += boxes.charAt(i) - '0';
                op += count;
            }
            return result;
        }
    }
}
