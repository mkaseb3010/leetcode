package DailyQuestionsDecember;

public class December27 {
    class Solution {
        public int maxScoreSightseeingPair(int[] values) {
            int maxScore = 0;
            int prev = values[0] + 0;
    
            for (int i = 1; i < values.length; i++) {
                maxScore = Math.max(maxScore, prev + values[i] - i);
                prev = Math.max(prev, values[i] + i);
            }
            return maxScore;
        }
    }
}
