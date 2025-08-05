package DailyQuestionsMay;

import java.util.Arrays;

/**
 * LeetCode Daily Challenge for May 19, 2025.
 * Problem: Triangle Type.
 * Link: https://leetcode.com/problems/triangle-type/
 */

// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class May19 {
    public class Solution {
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
