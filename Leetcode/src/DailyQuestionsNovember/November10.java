package DailyQuestionsNovember;

public class November10 {
    public class Solution {
        public int minimumSubarrayLength(int[] nums, int k) {
            int min = Integer.MAX_VALUE;
            int curr = 0;
            int start = 0;
            int n = nums.length;
            int[] bitCount = new int[32];
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 32; j++) {
                    if ((nums[i] & (1 << j)) != 0) {
                        if (bitCount[j] == 0) {
                            curr |= (1 << j);
                        }
                        bitCount[j]++;
                    }
                }
    
                while (curr >= k) {
                    min = Math.min(min, i - start + 1);
                    if (min == 1) {
                        return 1;
                    }
                    for (int s = 0; s < 32; s++) {
                        if ((nums[start] & (1 << s)) != 0) {
                            bitCount[s]--;
                            if (bitCount[s] == 0) {
                                curr &= ~(1 << s);
                            }
                        }
                    }
                    start++;
                }
            }
            return min == Integer.MAX_VALUE ? -1 : min; 
        }
    }
}
