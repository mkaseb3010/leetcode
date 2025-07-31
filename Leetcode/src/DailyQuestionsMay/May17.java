package DailyQuestionsMay;

/**
 * LeetCode Daily Challenge for May 17, 2023.
 * Problem: Sort Colors.
 * Link: https://leetcode.com/problems/sort-colors/
 */

// Time Complexity: O(n)
// Space Complexity: O(1)

public class May17 {
    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }else if (nums[mid] == 1) {
                    mid++;
                }else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }
}
