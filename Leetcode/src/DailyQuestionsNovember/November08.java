package DailyQuestionsNovember;

public class November08 {
    public class Solution {
        public int[] getMaximumXor(int[] nums, int maximumBit) {
            int n = nums.length;
            int[] result = new int[n];
            int mask = (1 << maximumBit) - 1;
            int xOrSum = 0;
    
            for (int num : nums) {
                xOrSum ^= num;
            }
    
            for (int i = 0; i < n; i++) {
                result[i] = xOrSum ^ mask;
                xOrSum ^= nums[n - 1- i];
            }
            return result;
        }
    }
}
