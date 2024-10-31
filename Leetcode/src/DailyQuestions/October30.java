package DailyQuestions;

public class October30 {
    public class Solution {
        public int minimumMountainRemovals(int[] nums) {
            int n = nums.length;
            int[] incr = new int[n];
            int[] decr = new int[n];
    
            for (int i = 0; i < n; i++) {
                incr[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (nums[j] < nums[i]) {
                        incr[i] = Math.max(incr[i], incr[j] + 1);
                    }
                }
            }
    
            for (int i = n - 1; i >= 0; i--) {
                decr[i] = 1;
                for (int j = n - 1; j > i; j--) {
                    if (nums[j] < nums[i]) {
                        decr[i] = Math.max(decr[i], decr[j] + 1);
                    }
                }
            }
    
            int max = 0;
            for (int i = 1; i < n - 1; i++) {
                if (incr[i] > 1 && decr[i] > 1) {
                    max = Math.max(max, incr[i] + decr[i] - 1);
                }
            }
            return n - max;
        }
    }
}
