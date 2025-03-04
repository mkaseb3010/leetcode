package DailyQuestionsFebruary;

public class February26 {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            int max = 0;
            int min = 0;
            int maxEnding = 0;
            int minEnding = 0;
    
            for (int num : nums) {
                maxEnding = Math.max(num, maxEnding + num);
                minEnding = Math.min(num, minEnding + num);
                max = Math.max(max, maxEnding);
                min = Math.min(min, minEnding);
            }
            return Math.max(max, Math.abs(min));
        }
    }
}
