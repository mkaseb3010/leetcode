package DailyQuestionsApril;

import java.util.*;

public class April16 {
    class Solution {
        public long countGood(int[] nums, int k) {
            int n = nums.length;
            HashMap<Integer, Integer> freq = new HashMap<>();
            long res = 0;
            int left = 0;
            long pairs = 0;

            for (int right = 0; right < n; right++) {
                int val = nums[right];
                int count = freq.getOrDefault(val, 0);
                pairs += count;
                freq.put(val, count + 1);

                while (pairs >= k) {
                    res += (n - right);
                    int leftVal = nums[left];
                    int leftCount = freq.get(leftVal);
                    pairs -= (leftCount - 1);
                    freq.put(leftVal, leftCount - 1);
                    left++;
                }
            }
            return res;
        }
    }
}
