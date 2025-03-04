package DailyQuestionsFebruary;

import java.util.PriorityQueue;

public class February13 {
    
    class Solution {
        public int minOperations(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int num : nums) {
                if (num < k) minHeap.add(num);
            }

            int op = 0;

            while (!minHeap.isEmpty()) {
                int x = minHeap.poll();
                op++;

                if (minHeap.isEmpty()) {
                    break;
                }

                int y = minHeap.poll();
                long newValue = 2L * x + y;

                if (newValue < k) {
                    minHeap.add((int) newValue);
                }
            }
            return op;
        }
    }
}
