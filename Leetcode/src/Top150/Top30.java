package Top150;

public class Top30 {
    public class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int min = Integer.MAX_VALUE;
            int curr = 0;
            int start = 0;
    
            for (int i = 0; i < nums.length; i++) {
                curr += nums[i];
    
                while (curr >= target) {
                    min = Math.min(min, i - start + 1);
                    curr -= nums[start];
                    start++;
                }
            }
            if (min == Integer.MAX_VALUE) {
                return 0;
            }else {
                return min;
            }
        }
    }
}
