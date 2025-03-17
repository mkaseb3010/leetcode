public class March15 {
    class Solution {
        private boolean canRob(int[] nums, int k, int cap) {
            int count = 0;
            int i = 0;
    
            while (i < nums.length) {
                if (nums[i] <= cap) {
                    count++;
                    i++;
                }
                i++;
            }
            return count >= k;
        }
    
        public int minCapability(int[] nums, int k) {
            int low = Integer.MAX_VALUE;
            int high = 0;
    
            for (int num : nums) {
                low = Math.min(low, num);
                high = Math.max(high, num);
            }
    
            while (low < high) {
                int mid = low + (high - low) / 2;
    
                if (canRob(nums, k, mid)) {
                    high = mid;
                }else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
