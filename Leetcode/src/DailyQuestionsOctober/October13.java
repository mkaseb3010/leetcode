package DailyQuestionsOctober;
import java.util.*;

public class October13 {
	public class Solution {
	    public int[] smallestRange(List<List<Integer>> nums) {
	        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < nums.size(); i++) {
	            int value = nums.get(i).get(0);
	            minHeap.add(new int[]{value, i, 0});
	            max = Math.max(max, value);
	        }

	        int start = -100000;
	        int end = 100000;

	        while (minHeap.size() == nums.size()) {
	            int[] curr = minHeap.poll();
	            int min = curr[0];
	            int list = curr[1];
	            int element = curr[2];

	            if (max - min < end - start) {
	                start = min;
	                end = max;
	            }

	            if (element + 1 < nums.get(list).size()) {
	                int next = nums.get(list).get(element + 1);
	                minHeap.add(new int[]{next, list, element + 1});
	                max = Math.max(max, next);
	            }
	        }
	        return new int[]{start, end};
	    }
	}
}
