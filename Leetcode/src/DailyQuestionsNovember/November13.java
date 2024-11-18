package DailyQuestionsNovember;

import java.util.Arrays;

public class November13 {
    public class Solution {
        private int lowerBound(int[] nums, int start, int target) {
            int left = start;
            int right = nums.length;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= target) {
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }
            return left;
        }

        private int higherBound(int[] nums, int start, int target) {
            int left = start;
            int right = nums.length;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }
            return left;
        }

        public long countFairPairs(int[] nums, int lower, int upper) {
            Arrays.sort(nums);
            long count = 0;

            for (int i = 0; i < nums.length; i++) {
                int low = lowerBound(nums, i + 1, lower - nums[i]);
                int high = higherBound(nums, i + 1, upper - nums[i]);
                count += high - low;
            }
            return count;
        }
    }
}
