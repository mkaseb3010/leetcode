package DailyQuestionsFebruary;

public class February03 {
    class Solution {
        public int longestMonotonicSubarray(int[] nums) {
            int n = nums.length;
    
            if (n == 1) {
                return 1;
            }
    
            int increment = 1;
            int decrement = 1;
            int max = 1;
    
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[i - 1]) {
                    increment++;
                    decrement = 1;
                }else if (nums[i] < nums[i - 1]) {
                    decrement++;
                    increment = 1;
                }else {
                    increment = 1;
                    decrement = 1;
                }
                max = Math.max(max, Math.max(increment, decrement));
            }
            return max;
        }
    }
}
