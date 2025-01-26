package DailyQuestionsDecember;

import java.util.PriorityQueue;

public class December12 {
    class Solution {
        public long pickGifts(int[] gifts, int k) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int gift : gifts) {
                maxHeap.offer(gift);
            }

            while (k-- > 0) {
                int maxGifts = maxHeap.poll();
                int remaining = (int) Math.sqrt(maxGifts);
                maxHeap.offer(remaining);
            }

            long total = 0;

            while(!maxHeap.isEmpty()) {
                total += maxHeap.poll();
            }
            return total;
        }
    }
}
