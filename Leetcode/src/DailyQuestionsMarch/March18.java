package DailyQuestionsMarch;

public class March18 {
    class Solution {
        public int longestNiceSubarray(int[] nums) {
            int n = nums.length;
            int max = 0;
            int left = 0;
            int used = 0;
    
            for (int right = 0; right < n; right++) {
                while ((used & nums[right]) != 0) {
                    used ^= nums[left];
                    left++;
                }
                used |= nums[right];
                max = Math.max(max, right - left + 1);
            }
            return max;
        }
    }
}
