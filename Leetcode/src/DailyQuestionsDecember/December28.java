package DailyQuestionsDecember;

public class December28 {
    class Solution {
        public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
            int n = nums.length;
            int[] sum = new int[n + 1];
    
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
    
            int[] left = new int[n];
            int[] right = new int[n];
            int leftIndex = 0;
    
            for (int i = k - 1; i < n; i++) {
                if (sum[i + 1] - sum[i + 1 - k] > sum[leftIndex + k] - sum[leftIndex]) {
                    leftIndex = i + 1 - k;
                }
                left[i] = leftIndex;
            }
    
            int rightIndex = n - k;
    
            for (int i = n - k; i >= 0; i--) {
                if (sum[i + k] - sum[i] >= sum[rightIndex + k] - sum[rightIndex]) {
                    rightIndex = i;
                }
                right[i] = rightIndex;
            }
    
            int[] result = new int[3];
            int max = 0;
    
            for (int i = k; i <= n - 2 * k; i++) {
                int l = left[i - 1];
                int r = right[i + k];
                int total = (sum[l + k] - sum[l]) + (sum[i + k] - sum[i]) + (sum[r + k] - sum[r]);
                if (total > max) {
                    max = total;
                    result[0] = l;
                    result[1] = i;
                    result[2] = r;
                }
            }
            return result;
        }
    }
}
