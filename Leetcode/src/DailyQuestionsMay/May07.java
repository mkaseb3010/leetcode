package DailyQuestionsMay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode Daily Challenge for May 7, 2023.
 * Problem: Minimum Time to Reach Destination in a Grid.
 * Link: https://leetcode.com/problems/minimum-time-to-reach-destination-in-a-grid/
 */

// Time Complexity: O(n * m * log(n * m))
// Space Complexity: O(n * m)

public class May07 {
    class Solution {
        public int minTimeToReach(int[][] moveTime) {
            int n = moveTime.length;
            int m = moveTime[0].length;
            int[][] dp = new int[n][m];

            for (int[] row : dp) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }

            PriorityQueue<int[]> minh = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

            minh.add(new int[]{0, 0, 0});
            moveTime[0][0] = 0;

            int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

            while (!minh.isEmpty()) {
                int[] current = minh.poll();
                int currTime = current[0];
                int currRow = current[1];
                int currCol = current[2];

                if (currTime >= dp[currRow][currCol]) {
                    continue;
                }

                if (currRow == n - 1 && currCol == m - 1) {
                    return currTime;
                }

                dp[currRow][currCol] = currTime;

                for (int[] dir : directions) {
                    int nextRow = currRow + dir[0];
                    int nextCol = currCol + dir[1];

                    if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < m &&dp[nextRow][nextCol] == Integer.MAX_VALUE) {
                        int nextTime = Math.max(moveTime[nextRow][nextCol], currTime) + 1;
                        minh.add(new int[]{nextTime, nextRow, nextCol});
                    }
                }
            }
            return -1;
        }
    }
}
