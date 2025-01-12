package Top150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top49 {
    public class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length <= 1) {
                return intervals;
            }

            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> merged = new ArrayList<>();
            int[] curr = intervals[0];
            merged.add(curr);

            for (int[] interval : intervals) {
                int currStart = curr[0];
                int currEnd = curr[1];
                int nextStart = interval[0];
                int nextEnd = interval[1];

                if (currEnd >= nextStart) {
                    curr[1] = Math.max(currEnd, nextEnd);
                }else {
                    curr = interval;
                    merged.add(curr);
                }
            }
            return merged.toArray(new int[merged.size()][]);
        }
    }
}
