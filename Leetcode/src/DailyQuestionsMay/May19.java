package DailyQuestionsMay;

import java.util.Arrays;

public class May19 {
    class Solution {
        public String triangleType(int[] nums) {
            Arrays.sort(nums);

            int a = nums[0];
            int b = nums[1];
            int c = nums[2];

            if (a + b <= c) {
                return "none";
            }

            if (a == b && b == c) {
                return "equilateral";
            }

            if (a == b || b == c || a == c) {
                return "isosceles";
            
            }
            return "scalene";
        }
    }
}
