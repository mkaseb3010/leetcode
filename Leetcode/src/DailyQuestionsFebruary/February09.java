package DailyQuestionsFebruary;

import java.util.HashMap;
import java.util.Map;

public class February09 {
    class Solution {
        public long countBadPairs(int[] nums) {
            Map<Integer, Long> countMap = new HashMap<>();
            long totalP = 0;
            long goodP = 0;

            for (int i = 0; i < nums.length; i++) {
                int key = i - nums[i];
                if (countMap.containsKey(key)) {
                    goodP += countMap.get(key);
                }
                countMap.put(key, countMap.getOrDefault(key, 0L) + 1);
                totalP += i;
            }
            return totalP - goodP;
        }
    }
}
