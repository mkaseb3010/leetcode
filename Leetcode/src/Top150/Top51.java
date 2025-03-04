package Top150;

import java.util.Arrays;

public class Top51 {
    public class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points == null || points.length == 0) {
                return 0;
            }

            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
            int count = 1;
            int pos = points[0][1];

            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > pos) {
                    count++;
                    pos = points[i][1];
                }
            }
            return count;
        }
    }
}
