package DailyQuestionsNovember;

import java.util.HashSet;

public class November19 {
    public class Solution {
        public long maximumSubarraySum(int[] nums, int k) {
            long max = 0;
            long curr = 0;
            HashSet<Integer> set = new HashSet<>();
            int start = 0;

            for (int i = 0; i < nums.length; i++) {
                while (set.contains(nums[i])) {
                    set.remove(nums[start]);
                    curr -= nums[start];
                    start++;
                }
                set.add(nums[i]);
                curr += nums[i];

                if (i - start + 1 == k) {
                    max = Math.max(max, curr);
                    set.remove(nums[start]);
                    curr -= nums[start];
                    start++;
                }
            }
            return max;
        }
    }
}
