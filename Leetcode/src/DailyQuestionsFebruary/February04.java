package DailyQuestionsFebruary;

public class February04 {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int max = 0;
            int curr = 0;
            int prev = 0;
    
            for (int num : nums) {
                if (num > prev) {
                    curr += num;
                }else {
                    curr = num;
                }
                max = Math.max(max, curr);
                prev = num;
            }
            return max;
        }
    }
}
