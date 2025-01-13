package DailyQuestionsDecember;

import java.util.Arrays;

public class December07 {
    public class Solution {
        private boolean canDivide(int[] nums, int maxOperations, int penalty) {
            int op = 0;

            for (int num : nums) {
                if (num > penalty) {
                    op += (num - 1) / penalty;
                }
                if (op > maxOperations) {
                    return false;
                }
            }
            return true;
        }

        public int minimumSize(int[] nums, int maxOperations) {
            int low = 1;
            int high = Arrays.stream(nums).max().getAsInt();
            int result = high;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (canDivide(nums, maxOperations, mid)) {
                    result = mid;
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            return result;
        }
    }
}
