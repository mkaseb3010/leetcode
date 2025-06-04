package DailyQuestionsApril;

public class April05 {
    class Solution {
        private int dfs(int[] nums, int index, int currentXor) {
            if (index == nums.length) {
                return currentXor;
            }

            int with = dfs(nums, index + 1, currentXor ^ nums[index]);
            int without = dfs(nums, index + 1, currentXor);

            return with + without;
        }
        
        public int subsetXORSum(int[] nums) {
            return dfs(nums, 0, 0);
        }
    }
}
