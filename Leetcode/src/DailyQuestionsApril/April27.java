public class April27 {
    class Solution {
        public int countSubarrays(int[] nums) {
            int count = 0;
            
            if (nums.length < 3) {
                return 0;
            }
            
            for (int i = 0; i <= nums.length - 3; i++) {
                int first = nums[i];
                int second = nums[i + 1];
                int third = nums[i + 2];

                if ((first + third) * 2 == second) {
                    count++;
                }
            }
            return count;
        }
    }
}
