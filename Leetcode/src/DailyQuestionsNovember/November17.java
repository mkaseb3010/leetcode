package DailyQuestionsNovember;

import java.util.Deque;
import java.util.LinkedList;

public class November17 {
    public class Solution {
        public int shortestSubarray(int[] nums, int k) {
            int n = nums.length;
            long[] prefixSum = new long[n + 1];

            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + nums[i];
            }

            int min = n + 1;
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < prefixSum.length; i++) {
                while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
                    min = Math.min(min, i - deque.pollFirst());
                }

                while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                    deque.pollLast();
                }
                deque.addLast(i);
            }
            return min == n + 1 ? -1 : min;
        }
    }
}
