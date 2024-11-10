package DailyQuestionsOctober;
import java.util.*;

public class October14 {
	public class Solution {
	    public long maxKelements(int[] nums, int k) {
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	        long score = 0;

	        for (int num : nums) {
	            maxHeap.add(num);
	        }

	        for (int i = 0; i < k; i++) {
	            int max = maxHeap.poll();
	            score += max;
	            int min = (int) Math.ceil(max / 3.0);
	            maxHeap.add(min);
	        }
	        return score;
	    }
	}
}
