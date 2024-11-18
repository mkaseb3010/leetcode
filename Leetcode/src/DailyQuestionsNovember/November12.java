package DailyQuestionsNovember;

import java.util.Arrays;

public class November12 {
    public class Solution {
        public int[] maximumBeauty(int[][] items, int[] queries) {
            Arrays.sort(items, (a, b) -> a[0] - b[0]);
            int n = queries.length;
            int[][] sorted = new int[n][2];

            for (int i = 0; i < n; i++) {
                sorted[i][0] = queries[i];
                sorted[i][1] = i;
            }

            Arrays.sort(sorted, (a, b) -> a[0] - b[0]);

            int[] result = new int[n];
            int max = 0;
            int index = 0;

            for (int[] query : sorted) {
                int queryPrice = query[0];
                int queryIndex = query[1];

                while (index < items.length && items[index][0] <= queryPrice) {
                    max = Math.max(max, items[index][1]);
                    index++;
                }
                result[queryIndex] = max;
            }
            return result;
        }
    }
}
