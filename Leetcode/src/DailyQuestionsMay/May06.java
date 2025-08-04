package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 6, 2023.
 * Problem: Build Array from Permutation.
 * Link: https://leetcode.com/problems/build-array-from-permutation/
 */

// Time Complexity: O(n)
// Space Complexity: O(1)

public class May06 {
    public class Solution {
        public int[] buildArray(int[] nums) {
            for (int i = 0; i < nums.length; i++)
                nums[i] += (1024 * (nums[nums[i]] % 1024));
            
            for (int i = 0; i < nums.length; i++)
                nums[i] /= 1024;
            
            return nums;
        }
    }
}
