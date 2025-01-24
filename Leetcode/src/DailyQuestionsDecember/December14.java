package DailyQuestionsDecember;

import java.util.Deque;
import java.util.LinkedList;

public class December14 {
    class Solution {
        public long continuousSubarrays(int[] nums) {
            int n = nums.length;
            Deque<Integer> minDeque = new LinkedList<>();
            Deque<Integer> maxDeque = new LinkedList<>();
            long result = 0;
            int left = 0;

            for (int right = 0; right < n; right++) {
                while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[right]) {
                    minDeque.pollLast();
                }
                minDeque.offerLast(right);

                while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[right]) {
                    maxDeque.pollLast();
                }
                maxDeque.offerLast(right);

                while (!minDeque.isEmpty() && !maxDeque.isEmpty() &&
                        nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > 2) {
                            left++;

                    if (minDeque.peekFirst() < left) {
                        minDeque.pollFirst();
                    }

                    if (maxDeque.peekFirst() < left) {
                        maxDeque.pollFirst();
                    }
                }
                result += right - left + 1;
            }
            return result;
        }
    }
}
