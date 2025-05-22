package DailyQuestionsMarch;

public class March12 {
    class Solution {
        private int binarySearch(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
                
                if (nums[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            return left;
        }
    
        public int maximumCount(int[] nums) {
            int n = nums.length;
            int posIndex = binarySearch(nums, 0);
            int negCount = posIndex;
            int posCount = n - binarySearch(nums, 1);
            return Math.max(negCount, posCount);
        }
    }    
}
