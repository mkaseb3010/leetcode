package DailyQuestionsDecember;

import java.util.PriorityQueue;

public class December17 {
    class Solution {
        public String repeatLimitedString(String s, int repeatLimit) {
            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    maxHeap.offer(new int[]{i, freq[i]});
                }
            }

            StringBuilder result = new StringBuilder();

            while (!maxHeap.isEmpty()) {
                int[] curr = maxHeap.poll();
                char currCh = (char) (curr[0] + 'a');
                int count = Math.min(curr[1], repeatLimit);

                for (int i = 0; i < count; i++) {
                    result.append(currCh);
                }

                curr[1] -= count;

                if (curr[1] > 0) {
                    if (!maxHeap.isEmpty()) {
                        int[] next = maxHeap.poll();
                        char nextCh = (char) (next[0] + 'a');
                        result.append(nextCh);
                        next[1]--;

                        if (next[1] > 0) {
                            maxHeap.offer(next);
                        }
                            maxHeap.offer(curr);
                    }else {
                        break;
                    }
                }
            }
            return result.toString();
        }
    }
}
