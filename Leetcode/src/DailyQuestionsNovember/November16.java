package DailyQuestionsNovember;

public class November16 {
    public class Solution {
        public int[] resultsArray(int[] nums, int k) {
            int[] results = new int[nums.length - k + 1];
    
            for (int i = 0; i <= nums.length - k; i++) {
                boolean isConsecutive = true;
                int max = nums[i];
    
                for (int j = i + 1; j < i + k; j++) {
                    max = Math.max(max, nums[j]);
                    
                    if (nums[j] != nums[j - 1] + 1) {
                        isConsecutive = false;
                    }
                }
                if (isConsecutive) {
                    results[i] = max;
                }else {
                    results[i] = -1;
                }
            }
            return results;
        }
    }
}
