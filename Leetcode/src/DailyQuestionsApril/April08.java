package DailyQuestionsApril;

import java.util.*;

public class April08 {
        class Solution {
        public int minimumOperations(int[] nums) {
            int n = nums.length;
            int ops = 0;
            int i = 0;

            while (i < n) {
                Set<Integer> seen = new HashSet<>();
                int j = i;
                boolean duplicate = false;

                while (j < n) {
                    if (seen.contains(nums[j])) {
                        duplicate = true;
                        break;
                    }
                    seen.add(nums[j]);
                    j++;
                }

                if (!duplicate) {
                    break;
                }

                i += 3;
                ops++;
            }
            return ops;
        }
    }
}
