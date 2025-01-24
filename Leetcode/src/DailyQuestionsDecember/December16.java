package DailyQuestionsDecember;

import java.util.PriorityQueue;

public class December16 {
    class Solution {
        static class Element {
            int value;
            int index;

            Element(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }

        public int[] getFinalState(int[] nums, int k, int multiplier) {
            PriorityQueue<Element> minHeap = new PriorityQueue<>(
                (a, b) -> a.value == b.value ? a.index - b.index : a.value - b.value
            );

            for (int i = 0; i < nums.length; i++) {
                minHeap.offer(new Element(nums[i], i));
            }

            for (int i = 0; i < k; i++) {
                Element smallest = minHeap.poll();
                smallest.value *= multiplier;
                minHeap.offer(smallest);
            }

            int[] result = new int[nums.length];

            while (!minHeap.isEmpty()) {
                Element element = minHeap.poll();
                result[element.index] = element.value;
            }

            return result;
        }
    }
}
