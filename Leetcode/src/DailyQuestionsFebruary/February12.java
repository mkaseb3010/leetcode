package DailyQuestionsFebruary;

import java.util.HashMap;

public class February12 {
    class Solution {
        private int digitSum(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

        public int maximumSum(int[] nums) {
            HashMap<Integer, Integer> maxMap = new HashMap<>();
            int max = -1;

            for (int num : nums) {
                int sum = digitSum(num);

                if (maxMap.containsKey(sum)) {
                    max = Math.max(max, maxMap.get(sum) + num);
                }
                maxMap.put(sum, Math.max(maxMap.getOrDefault(sum, 0), num));
            }
            return max;
        }
    }
}
