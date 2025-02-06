package DailyQuestionsFebruary;

import java.util.HashMap;
import java.util.Map;

public class February06 {
    class Solution {
        public int tupleSameProduct(int[] nums) {
            Map<Integer, Integer> product = new HashMap<>();
            int n = nums.length;
            int result = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int prod = nums[i] * nums[j];
                    product.put(prod, product.getOrDefault(prod, 0) + 1);
                }
            }

            for (int count : product.values()) {
                if (count > 1) {
                    result += (count * (count - 1) / 2) * 8;
                }
            }
            return result;
        }
    }
}
