package DailyQuestionsApril;

import java.util.*;

public class April24 {
    class Solution {
        public int countCompleteSubarrays(int[] nums) {
            int left = 0, res = 0;
            int k = (int) Arrays.stream(nums).distinct().count();
            Map<Integer, Integer> arrayMap = new HashMap<>();

            for (int i = 0; i < nums.length; ++i) {
                arrayMap.put(nums[i], arrayMap.getOrDefault(nums[i], 0) + 1);

                while (arrayMap.size() == k) {
                    res += nums.length - i;
                    arrayMap.put(nums[left], arrayMap.get(nums[left]) - 1);

                    if (arrayMap.get(nums[left]) == 0) {
                        arrayMap.remove(nums[left]);
                        left++;
                    }
                }
            }
            return res;
        }
    }
}
