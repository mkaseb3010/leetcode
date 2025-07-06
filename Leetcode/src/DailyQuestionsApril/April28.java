package DailyQuestionsApril;

public class April28 {
    class Solution {
        public long countSubarrays(int[] nums, long k) {
            long count = 0;
            int n = nums.length;
            int left = 0;
            long sum = 0;
            
            for (int right = 0; right < n; right++) {
                sum += nums[right];
                
                while (sum * (right - left + 1) >= k) {
                    sum -= nums[left];
                    left++;
                }
                count += (right - left + 1);
            }
            return count;
        }
    }
}
