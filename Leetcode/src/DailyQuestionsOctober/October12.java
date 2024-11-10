package DailyQuestionsOctober;
import java.util.*;

public class October12 {
	public class Solution {
	    public int minGroups(int[][] intervals) {
	        int n = intervals.length;
	        int[] start = new int[n];
	        int[] end = new int[n];

	        for (int i = 0; i < n; i++) {
	            start[i] = intervals[i][0];
	            end[i] = intervals[i][1];
	        }

	        start = Arrays.stream(start).sorted().toArray();
	        end = Arrays.stream(end).sorted().toArray();

	        int max = 0;
	        int groups = 0;
	        int i = 0;
	        int j = 0;

	        while (i < n) {
	            if (start[i] <= end[j]) {
	                groups++;
	                max = Math.max(max, groups);
	                i++;
	            }else {
	                groups--;
	                j++;
	            }
	        }
	        return max;
	    }
	}
}
