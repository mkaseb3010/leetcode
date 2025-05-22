package DailyQuestionsMarch;

import java.util.*;

public class March27 {
    class Solution {
        public int minimumIndex(List<Integer> nums) {
            int candidate = -1;
            int count = 0;
    
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }
    
            int total = 0;
            for (int num : nums) {
                if (num == candidate) {
                    total++;
                }
            }
    
            int left = 0;
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) == candidate) {
                    left++;
                }
                int leftlen = i + 1;
                int rightlen = nums.size() - leftlen;
                int right = total - left;
    
                if (left * 2 > leftlen && right * 2 > rightlen) {
                    return i;
                }
            }
            return -1;
        }
    }
}
