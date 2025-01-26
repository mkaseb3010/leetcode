package DailyQuestionsDecember;

import java.util.PriorityQueue;

public class December13 {
    class Solution {
        public long findScore(int[] nums) {
            int n = nums.length;
            boolean[] marked = new boolean[n];
            PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            });

            for (int i = 0; i < n; i++) {
                minHeap.offer(new int[]{nums[i], i});
            }

            long score = 0;

            while (!minHeap.isEmpty()) {
                int[] curr = minHeap.poll();
                int val = curr[0];
                int index = curr[1];

                if (marked[index]) {
                    continue;
                }

                score += val;
                marked[index] = true;
                
                if (index - 1 >= 0) {
                    marked[index - 1] = true;
                }

                if (index + 1 < n) {
                    marked[index + 1] = true;
                }
            }
            return score;
        }
    }
}
