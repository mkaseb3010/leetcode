package DailyQuestionsDecember;

import java.util.HashSet;
import java.util.Set;

public class December06 {
    public class Solution {
        public int maxCount(int[] banned, int n, int maxSum) {
            Set<Integer> bannedSet = new HashSet<>();

            for (int b : banned) {
                bannedSet.add(b);
            }

            int count = 0;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (!bannedSet.contains(i) && sum + i <= maxSum) {
                    sum += i;
                    count++;
                }
            }
            return count;
            
        }
    }
}
